package com.wind.uo.service;

import com.wind.uo.domain.Order;
import com.wind.uo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImp implements OrderService {
//"http://localhost:8081/user/queryPoints.action"
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    OrderMapper orderMapper;

    @Override
    public void pay(String orderId) throws Exception {
       Order order = orderMapper.queryOrder(orderId);
        System.out.println(orderId);
        System.out.println(order);
        String addPointsAddr = "http://service-user/user/addPoints.action?userId="+order.getUserId()+"&money="+order.getOrderMoney();
        System.out.println(addPointsAddr);
        String result = restTemplate.getForObject(addPointsAddr, String.class);
        if ("0".equals(result)){
            throw new Exception("计算积分失败");
        }

    }
}
