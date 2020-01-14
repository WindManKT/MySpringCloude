package com.wind.uo.service;

import com.wind.uo.domain.User;
import com.wind.uo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryPoints(String userId) {
        return userMapper.queryPoints(userId);
    }

    @Override
    public void addPoints(String userId, int money) throws Exception {
       try {
           userMapper.addPoints(userId,money*10);
       }catch (Exception e){
           throw new Exception("0");
       }
    }
}
