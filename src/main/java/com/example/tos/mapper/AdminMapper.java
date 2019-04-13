package com.example.tos.mapper;

import com.example.tos.pojo.Administrator;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AdminMapper {
    @Select("SELECT * FROM `tos_admin` WHERE `adid` = #{adid}")
    Administrator getOneById(String adid);

    @Update("UPDATE `tos_admin` SET `adname`=#{adname},`sex`=#{sex},`cardNumber`=#{cardNumber},`password`=#{password},`phone`=#{phone} WHERE adid = #{adid}")
    int update(Administrator admin);
}

