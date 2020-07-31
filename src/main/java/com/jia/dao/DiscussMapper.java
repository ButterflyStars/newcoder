package com.jia.dao;

import com.jia.pojo.Discuss;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ButterflyStars
 * @DateTime: Created in 2020/7/30 16:33
 * @QQ: 1498575492
 * Description: No Description
 */
@Mapper
public interface DiscussMapper {
    List<Discuss> selectDiscussList(int userId);

    int selectDiscussById(@Param("userId") int userId);
}
