/*package com.yoke.ego.frontweb.handler;

import com.yoke.ego.common.exception.EgoException;
import com.yoke.ego.frontweb.common.EgoResult;
import com.yoke.ego.frontweb.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.net.BindException;

*//**
 * Created by Yoke on 2018/3/27
 *//*
@ControllerAdvice
public class RestCtrlExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestCtrlExceptionHandler.class);

    @ExceptionHandler(BindException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public EgoResult<Object> bindExceptionHanlers(BindException e) {
        String errorMsg = "请求的额数据校验不合法";
        if (e != null) {
            errorMsg = e.getMessage();
            LOGGER.warn(errorMsg);
        }
        return new ResultUtil<>().setError(errorMsg);
    }

    @ExceptionHandler(EgoException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public EgoResult<Object> handleEgoException(EgoException e) {
        String errorMsg = "EgoException: ";
        if (e != null) {
            errorMsg = e.getMessage();
            LOGGER.warn(errorMsg);
        }
        return new ResultUtil<>().setError(errorMsg);
    }
*//*
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public EgoResult<Object> handleException(Exception e) {
        String errorMsg = "exception: ";
        if (e != null) {
            errorMsg = e.getMessage();
            LOGGER.error(errorMsg);
        }
        return new ResultUtil<>().setError(errorMsg);
    }*//*
}*/
