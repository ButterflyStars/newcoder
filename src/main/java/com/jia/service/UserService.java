package com.jia.service;

import com.jia.pojo.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ButterflyStars
 * @DateTime: Created in 2020/7/30 16:57
 * @QQ: 1498575492
 * Description: No Description
 */
public interface UserService {
    User findUserById(int id);
    User selectByName(String username);
    User selectByEmail(String email);
    int insrtUser(User user);
    int insertStatus(int id,int status);
    int insertHeader(int id,String headerUrl);
    int insertPassword(int id,String password);
}
