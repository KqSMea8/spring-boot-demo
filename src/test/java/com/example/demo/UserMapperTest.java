package com.example.demo;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by yujian on 2019/1/3.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void insertTest() throws Exception{
        User user = new User();
        user.setUserName("xiaoming");
        user.setAddress("beijing");
        user.setSex(1);
        user.setAge(24);
        userMapper.insert(user);
    }

    @Test
    public void getSinUserTest(){
        User user = userMapper.getSinUser("xiaoming");
        System.out.println(user.toString());
    }
}
