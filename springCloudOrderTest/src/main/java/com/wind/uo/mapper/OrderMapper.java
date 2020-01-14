package com.wind.uo.mapper;

import com.wind.uo.domain.Order;
import org.springframework.stereotype.Component;

@Component
public interface OrderMapper {
    Order queryOrder(String orderId);
}
