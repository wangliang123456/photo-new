package com.wangliang.photo.service;

import com.wangliang.photo.model.OrderCreateRequest;
import com.wangliang.photo.model.vo.OrderVO;

import java.util.List;

/**
 * @author wangliang
 */
public interface OrderService {
    /**
     * 查询用户所有的订单
     * @param udid
     * @return
     */
    List<OrderVO> queryAllUserOrders(String udid);

    /**
     * 创建订单
     *
     * @param orderCreateRequest
     * @return
     */
    OrderVO createOrder(OrderCreateRequest orderCreateRequest);

    /**
     *
     * @param orderId
     * @return
     */
    OrderVO queryOrderById(long orderId);
}
