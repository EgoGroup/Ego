package com.yoke.ego.common.mapper;

import com.yoke.ego.common.pojo.ItemImage;
import com.yoke.ego.common.pojo.ItemImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemImageMapper {
    long countByExample(ItemImageExample example);

    int deleteByExample(ItemImageExample example);

    int deleteByPrimaryKey(Long itemImageId);

    int insert(ItemImage record);

    int insertSelective(ItemImage record);

    List<ItemImage> selectByExample(ItemImageExample example);

    ItemImage selectByPrimaryKey(Long itemImageId);

    int updateByExampleSelective(@Param("record") ItemImage record, @Param("example") ItemImageExample example);

    int updateByExample(@Param("record") ItemImage record, @Param("example") ItemImageExample example);

    int updateByPrimaryKeySelective(ItemImage record);

    int updateByPrimaryKey(ItemImage record);
}