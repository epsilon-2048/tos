package com.example.tos.mapper;

import com.example.tos.pojo.Teacher;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;

/*
@Select 是查询类的注解，所有的查询均使用这个
@Result 修饰返回的结果集，关联实体类属性和数据库字段一一对应，如果实体类属性和数据库属性名保持一致，就不需要这个属性来修饰。
@Insert 插入数据库使用，直接传入实体类会自动解析属性到对应的值
@Update 负责修改，也可以直接传入对象
@delete 负责删除

 */
public interface TeacherMapper {
    @Select("SELECT * FROM `tos_teacher` WHERE `tid` = #{tid}")
    Teacher getOneById(String tid);

    @Delete("DELETE FROM `tos_teacher` WHERE `tid` = '${tid}';")
    int delete(@Param("tid") String tid);

    @Insert("INSERT INTO `tos_teacher`(`tid`,`tname`,`sex`,`cardNumber`,`password`,`title`,`phone`) VALUES(#{tid},#{tname},#{sex},#{cardNumber},#{password},#{title},#{phone});")
    int insert(Teacher teacher);

    @Update("UPDATE `tos_teacher` SET `tname`=#{tname},`sex`=#{sex},`cardNumber`=#{cardNumber},`password`=#{password},`title`=#{title},`phone`=#{phone} WHERE tid = #{tid}")
    int update(Teacher teacher);;

}
