package com.wind.uo.service;

import com.wind.uo.domain.User;

public interface UserService {

    User queryPoints(String userId);

    void addPoints(String userId, int money) throws Exception;

}
