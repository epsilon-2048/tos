package com.example.tos.result;

/**
 *  统一格式处理工具类
 */

public class ResultUtil {

    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result sussess(Object data){
        Result result = new Result();
        result.setMsg(CodeEnum.SUCCESS.getMsg());
        result.setCode(CodeEnum.SUCCESS.getCode());
        result.setData(data);
        return result;
    }

    public static Result sussess(){
        return sussess(null);
    }



}
