package com.yoke.ego.frontweb.util;

import com.yoke.ego.frontweb.common.EgoResult;
import com.yoke.ego.frontweb.constant.EgoResultConstant;

/**
 * Created by Yoke on 2018/3/27
 */
public class ResultUtil<T> {
    private EgoResult<T> result;

    public ResultUtil() {
        result = new EgoResult<>();
        result.setCode(EgoResultConstant.SUCCESS.getCode());
        result.setMessage(EgoResultConstant.SUCCESS.getMessage());
    }

    public EgoResult<T> setData(T t) {
        this.result.setData(t);
        return this.result;
    }

    public EgoResult<T> setError(T msg) {
        this.result.setCode(EgoResultConstant.FAILED.getCode());
        this.result.setMessage(EgoResultConstant.FAILED.getMessage());
        this.result.setData(msg);
        return this.result;
    }

}
