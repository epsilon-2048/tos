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
     * 未知异常. ErrorCode : 1
     */
    UnknownException(1,"未知异常"),
    /**
     * 系统异常. ErrorCode : 2
     */
    SystemException(2,"系统异常"),
    /**
     * 业务错误. ErrorCode : 3
     */
    MyException(3,"业务错误"),
    /**
     * 提示级错误. ErrorCode : 4
     */
    InfoException(4, "提示级错误"),
    /**
     * 数据库操作异常. ErrorCode : 20001
     */
    DBException(20001,"数据库操作异常"),
    /**
     * 参数错误. ErrorCode : 40001
     */
    ParamException(40001,"参数错误"),

    /**
     * 权限错误. ErrorCode : 40002
     */
    JurisdictionException(40002,"权限错误"),

    /**
     * 数据库无此用户 ErrorCode ：40003
     */
    NoUserException(40003,"无此用户"),

    /**
     *  数据库题数不够 ErrorCode : 40004
     */
    NoEnough(40004,"题数不够"),

    /**
     * 此用户已存在，不得重复 ErrorCode ： 40005
     */
    UserExistException(40005, "此用户已存在，不得重复"),

    /**
     * 用户名或密码错误 ErrorCode ： 40006
     */

    AuthenticationException(40006,"用户名或密码错误");



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
