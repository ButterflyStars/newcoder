package com.jia.service;

import com.jia.pojo.Discuss;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ButterflyStars
 * @DateTime: Created in 2020/7/30 16:58
 * @QQ: 1498575492
 * Description: No Description
 */
public interface DiscussService {
    List<Discuss> selectDiscussList(int userId);

    int selectDiscussById(@Param("userId") int userId);
}
