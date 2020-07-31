package com.jia.service.impl;
import com.jia.dao.UserMapper;
import com.jia.pojo.User;
import com.jia.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ButterflyStars
 * @DateTime: Created in 2020/7/30 17:03
 * @QQ: 1498575492
 * Description: No Description
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findUserById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public User selectByName(String username) {
        return null;
    }

    @Override
    public User selectByEmail(String email) {
        return null;
    }

    @Override
    public int insrtUser(User user) {
        return 0;
    }

    @Override
    public int insertStatus(int id, int status) {
        return 0;
    }

    @Override
    public int insertHeader(int id, String headerUrl) {
        return 0;
    }

    @Override
    public int insertPassword(int id, String password) {
        return 0;
    }
}
