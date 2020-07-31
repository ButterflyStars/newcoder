package com.jia;

import com.jia.dao.UserMapper;
import com.jia.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewcoderApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = userMapper.selectById(101);
        System.out.println(user);
    }

    @Test
    public void logger(){
        Logger logger = LoggerFactory.getLogger(NewcoderApplicationTests.class);
        System.out.println(logger.getName());
        logger.debug("debug");
        logger.error("error");
    }
}
