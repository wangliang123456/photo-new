package com.wangliang.photo.controller;

import java.util.List;

import javax.annotation.Resource;

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
    public List<OrderVO> queryAllUserOrder(String udid) {
        return orderService.queryAllUserOrder(udid);
    }

}
