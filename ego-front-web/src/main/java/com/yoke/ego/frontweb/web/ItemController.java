package com.yoke.ego.frontweb.web;

import com.yoke.ego.common.pojo.*;
import com.yoke.ego.frontweb.common.EgoResult;
import com.yoke.ego.frontweb.dto.ItemDto;
import com.yoke.ego.frontweb.util.ResultUtil;
import com.yoke.ego.service.AttributeService;
import com.yoke.ego.service.CategoryService;
import com.yoke.ego.service.ItemImageService;
import com.yoke.ego.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by Yoke on 2018/3/25
 */
@Api(description = "商品")
@RestController
@RequestMapping("/item")
public class ItemController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);
    @Autowired
    private ItemService itemService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AttributeService attributeService;
    @Autowired
    private ItemImageService itemImageService;

    @ApiOperation(value = "列出某个分类下的所有商品")
    @GetMapping("/list/{categoryId}")
    public EgoResult<Object> listAll(@PathVariable Long categoryId) {
        if (categoryId == null) {
            throw new NullPointerException("传入的id为空");
        }
        Map map = itemService.listAll(categoryId);

        List<Category> categories = (List<Category>) map.get("categories");
        List<Item> items = (List<Item>) map.get("items");
        return new ResultUtil<>().setData(items);
    }


    @ApiOperation(value = "查看某一商品的详细信息")
    @GetMapping("/details/{itemId}")
    public EgoResult<Object> details(@PathVariable Long itemId) {

        Item item = itemService.selectByPrimaryKey(itemId);
        if (item == null) {
            throw new NullPointerException("没有该商品");
        }
        ItemDto itemDto = new ItemDto();
        AttributeExample attributeExample = new AttributeExample();
        attributeExample.or().andItemAttributeItemIdEqualTo(itemId);
        List<Attribute> attributes = attributeService.selectByExample(attributeExample);
        ItemImageExample itemImageExample = new ItemImageExample();
        itemImageExample.or().andItemImageAttributeIdEqualTo(itemId);
        List<ItemImage> itemImages = itemImageService.selectByExample(itemImageExample);
        itemDto.setId(itemId);
        itemDto.setAttributes(attributes);
        itemDto.setItemImages(itemImages);
        itemDto.setItemMemo(item.getItemMemo());
        itemDto.setItemSellNum(item.getItemSellNum());
        return new ResultUtil<>().setData(itemDto);
    }
}
