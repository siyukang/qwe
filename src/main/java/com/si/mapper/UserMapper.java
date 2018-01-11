package com.si.mapper;

import com.si.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */
@Mapper
public interface UserMapper {
    @Select("select * from testtable")
    List<User> getUserList();
    @Select("select count(id) from testtable")
    int getUserCount();
    @Select("select * from testtable limit #{index},#{rows}")
    List<User> getJsonList(HashMap<Object, Object> hashMap);
}
