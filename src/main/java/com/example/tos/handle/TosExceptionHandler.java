package com.example.tos.handle;

import com.example.tos.result.Result;
import com.example.tos.result.ResultUtil;
import com.example.tos.result.TosException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
public class TosExceptionHandler {

    @ExceptionHandler(value = TosException.class)
    @ResponseBody
    public Result handlerTosException(TosException e) {
        return ResultUtil.error(e.getCode(),e.getMsg());
    }
}
