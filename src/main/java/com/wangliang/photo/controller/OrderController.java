package com.wangliang.photo.controller;

import com.wangliang.photo.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wangliang
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Resource
    private OrderService orderService;



}
