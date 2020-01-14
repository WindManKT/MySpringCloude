package com.wind.uo.mapper;

import com.wind.uo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    User queryPoints(@Param("userId") String userId);

    void addPoints(@Param("userId") String userId, @Param("money") int money);

}
