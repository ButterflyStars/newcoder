package com.jia.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pojo.Discuss;
import com.jia.pojo.User;
import com.jia.service.DiscussService;
import com.jia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ButterflyStars
 * @DateTime: Created in 2020/7/30 17:11
 * @QQ: 1498575492
 * Description: No Description
 */
@Controller
public class HomeController {
    @Autowired
    private DiscussService discussService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    /**
     * @pageNum 前端传来的分页当前页
     */
    public String index(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum){
        PageHelper.startPage(pageNum,10);
        List<Discuss> discussList = discussService.selectDiscussList(0);
        List<Map<String,Object>> list = new ArrayList<>();
        if (discussList != null){
            for (Discuss discuss : discussList){
                Map<String,Object> map = new HashMap<>();
                map.put("discuss",discuss);
                User user = userService.findUserById(discuss.getUserId());
                map.put("user",user);
                list.add(map);
            }
        }
        PageInfo<Discuss> pageInfo = new PageInfo<>(discussList);
        model.addAttribute("list",list);    // 帖子信息
        model.addAttribute("pageInfo",pageInfo);    //分页信息
        return "index";
    }
}
