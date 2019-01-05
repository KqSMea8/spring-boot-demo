package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yujian on 2019/1/3.
 */
public interface UserMapper {

    @Insert("insert into users(userName, address, sex, age) values(#{userName}, #{address}," +
            "#{sex}, #{age})")
    public void insert(User user);

    @Select("select * from users where userName=#{userName}")
    @Results({
            @Result(property = "userName", column = "userName"),
            @Result(property = "address", column = "address"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "age", column = "age")
    })
    public User getSinUser(String userName);

    //fetch测试
    @Select("")
    public List<User> getUsers(int age);
}
