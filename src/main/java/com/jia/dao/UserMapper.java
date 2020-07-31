package com.jia.dao;

import com.jia.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ButterflyStars
 * @DateTime: Created in 2020/7/30 15:26
 * @QQ: 1498575492
 * Description: No Description
 */
@Mapper
public interface UserMapper {
    User selectById(int id);
    User selectByName(String username);
    User selectByEmail(String email);
    int insrtUser(User user);
    int insertStatus(int id,int status);
    int insertHeader(int id,String headerUrl);
    int insertPassword(int id,String password);
}
