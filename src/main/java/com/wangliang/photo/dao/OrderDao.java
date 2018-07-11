package com.wangliang.photo.dao;

import com.wangliang.photo.model.po.OrderPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangliang
 */
@Repository
public interface OrderDao {


    /**
     * 创建订单
     *
     * @param orderPO
     * @return
     */
    OrderPO createOrder(@Param("obj") OrderPO orderPO);

    /**
     * 删除订单
     *
     * @param orderId
     * @return
     */
    int deleteOrder(@Param("orderId") int orderId);

    /**
     * 查询订单
     *
     * @param orderId
     * @return
     */
    OrderPO queryOrderById(@Param("orderId") int orderId);

    /**
     * 查询用户相关的订单
     *
     * @param udid
     * @return
     */
    List<OrderPO> queryAllUserOrder(String udid);
}
