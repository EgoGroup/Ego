package com.yoke.ego.frontweb.common;

import com.yoke.ego.common.pojo.BaseResult;
import com.yoke.ego.frontweb.constant.EgoResultConstant;

import java.io.Serializable;

/**
 * Created by Yoke on 2018/3/23
 */
public class EgoResult<T> extends BaseResult<T> implements Serializable {
    public EgoResult(EgoResultConstant egoResultConstant, T t) {
        super(egoResultConstant.getCode(), egoResultConstant.getMessage(), t);
    }

    public EgoResult(int code, String message, T data) {
        super(code, message, data);
    }
    public EgoResult(){}

    public EgoResult(EgoResultConstant success) {
    }
}
