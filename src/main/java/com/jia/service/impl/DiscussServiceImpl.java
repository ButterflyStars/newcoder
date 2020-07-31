package com.jia.service.impl;

import com.jia.dao.DiscussMapper;
import com.jia.pojo.Discuss;
import com.jia.service.DiscussService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ButterflyStars
 * @DateTime: Created in 2020/7/30 16:58
 * @QQ: 1498575492
 * Description: No Description
 */
@Service
public class DiscussServiceImpl implements DiscussService {
    @Resource
    private DiscussMapper discussMapper;
    @Override
    public List<Discuss> selectDiscussList(int userId) {
        return discussMapper.selectDiscussList(userId);
    }

    @Override
    public int selectDiscussById(int userId) {
        return discussMapper.selectDiscussById(userId);
    }
}
