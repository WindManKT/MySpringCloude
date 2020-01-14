package com.wind.uo.controller;

import com.wind.uo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/pay.action")
    @ResponseBody
    public String pay(String orderId){

        try {
            orderService.pay(orderId);
            return "1";
        }catch (Exception e){
            return e.getMessage();
        }
    }

}
