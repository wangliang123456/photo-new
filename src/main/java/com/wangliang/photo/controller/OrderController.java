package com.wangliang.photo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.wangliang.photo.model.OrderCreateRequest;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wangliang.photo.model.vo.OrderVO;
import com.wangliang.photo.service.OrderService;

/**
 * @author wangliang
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Resource
    private OrderService orderService;


    /**
     *
     * @param udid
     * @return
     */
    @RequestMapping("/orders")
    public List<OrderVO> queryAllUserOrder(@Param("uuid") String udid) {
        return orderService.queryAllUserOrder(udid);
    }

    @PostMapping("/order/create")
    public OrderVO createOrder(@RequestBody OrderCreateRequest orderCreateRequest) {
        return orderService.createOrder(orderCreateRequest);
    }

}
