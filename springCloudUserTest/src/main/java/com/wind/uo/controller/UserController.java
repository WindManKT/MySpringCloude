package com.wind.uo.controller;

import com.wind.uo.domain.User;
import com.wind.uo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询用户积分
     * @param userId
     */
    @RequestMapping("/queryPoints.action")
    @ResponseBody
    public User queryPoints(String userId){
        System.out.println(userId);
        User user = userService.queryPoints(userId);
        System.out.println(user);
        return user;
    }

    /**
     * 增加积分
     * @param userId
     * @param money
     * @return
     */
    @RequestMapping("addPoints.action")
    @ResponseBody
    public String addPoints(String userId,int money){
            try{
                userService.addPoints(userId,money);
                return "1";
            }catch (Exception e){
                return "0";
            }
    }


}
