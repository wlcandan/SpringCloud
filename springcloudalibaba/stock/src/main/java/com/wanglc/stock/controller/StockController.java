package com.wanglc.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : wanglc
 * @date : 2022-05-18
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/reduct")
    public String reduct() {
        System.out.println("扣减库存！！！");
        //String MSG = restTemplate.getForObject("http://localhost:8090/order/add", String.class);
        return "扣减库存！！！";
    }
}
