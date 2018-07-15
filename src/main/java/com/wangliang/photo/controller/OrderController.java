package com.wangliang.photo.controller;

import java.util.List;

import javax.annotation.Resource;
import com.wangliang.photo.model.OrderCreateRequest;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;
import com.wangliang.photo.model.vo.OrderVO;
import com.wangliang.photo.service.OrderService;

/**
 * @author wangliang
 */
@RestController
@RequestMapping("")
public class OrderController {


    @Resource
    private OrderService orderService;


    /**
     *
     * @param udid
     * @return
     */
    @RequestMapping("/orders")
    public List<OrderVO> queryAllUserOrders(@Param("udid") String udid) {
        return orderService.queryAllUserOrders(udid);
    }

    @PostMapping("/order")
    public OrderVO createOrder(@RequestBody OrderCreateRequest orderCreateRequest) {
        return orderService.createOrder(orderCreateRequest);
    }

    @GetMapping("/order/{id}")
    public OrderVO getOrder(@PathVariable("id") long id) {
        return orderService.queryOrderById(id);
    }

    @PutMapping("/order/{id}")
    public OrderVO updateOrder(@RequestParam OrderCreateRequest orderCreateRequest) {
        return orderService.createOrder(orderCreateRequest);
    }
}

