package com.example.tos.mapper;

import com.example.tos.pojo.Choicequsetion;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ChoicequsetionMapper {
    @Select("SELECT * FROM `tos_choicequestion` LIMIT #{upper},#{leter}")
    List<Choicequsetion> getListFromAtoB(int upper, int leter);

    @Select("SELECT * FROM `tos_choicequestion` WHERE 'cid' = '${cid}'")
    Choicequsetion getOneById(@Param("cid") int cid);

    @Select("SELECT * FROM `tos_choicequestion`")
    List<Choicequsetion> getListAll();

    @Delete("DELETE FROM `tos_choicequestion` WHERE `cid` = '${cid}';")
    int delete(@Param("cid") int cid);

    @Insert("INSERT INTO `tos_choicequestion`(`cquestion`,`canswer`,`choicea`,`choiceb`,`choicec`,`choiced`) VALUES(#{cquestion},#{canswer},#{choicea},#{choiceb},#{choicec},#{choiced});")
    int insert(Choicequsetion choicequsetion);

    @Update("UPDATE `tos_choicequestion` SET `cquestion`=#{cquestion},`canswer`=#{canswer},`choicea`=#{choicea},`choiceb`=#{choiceb},`choicec`=#{choicec},`choiced`=#{choiced} WHERE `cid` = #{cid}")
    int update(Choicequsetion choicequsetion);
}
