package com.example.tos.result;

/**
 * 异常枚举类
 */

public enum CodeEnum {
    /**
     * 成功. ErrorCode : 0
     */
    SUCCESS(0,"成功"),
    /**
     * 未知异常. ErrorCode : 01
     */
    UnknownException(1,"未知异常"),
    /**
     * 系统异常. ErrorCode : 02
     */
    SystemException(2,"系统异常"),
    /**
     * 业务错误. ErrorCode : 03
     */
    MyException(3,"业务错误"),
    /**
     * 提示级错误. ErrorCode : 04
     */
    InfoException(4, "提示级错误"),
    /**
     * 数据库操作异常. ErrorCode : 020001
     */
    DBException(20001,"数据库操作异常"),
    /**
     * 参数错误. ErrorCode : 040001
     */
    ParamException(40001,"参数错误"),

    /**
     * 权限错误. ErrorCode : 040001
     */
    JurisdictionException(40002,"权限错误");


    private Integer code;

    private String msg;

    CodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
