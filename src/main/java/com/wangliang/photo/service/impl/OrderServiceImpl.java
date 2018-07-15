package com.wangliang.photo.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import com.wangliang.photo.dao.OrderPOMapper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.wangliang.photo.model.OrderCreateRequest;
import com.wangliang.photo.model.po.OrderPO;
import com.wangliang.photo.model.vo.OrderVO;
import com.wangliang.photo.service.OrderService;

/**
 * @author wangliang
 */
@Service
public class OrderServiceImpl implements OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Resource
    private OrderPOMapper orderPOMapper;

    /**
     * 查询用户所有的订单
     *
     * @param udid
     * @return
     */
    @Override
    public List<OrderVO> queryAllUserOrders(String udid) {
        List<OrderVO> orderVOList = Lists.newArrayList();
        if (StringUtils.isBlank(udid)) {
            return orderVOList;
        }
        List<OrderPO> orderPOList = orderPOMapper.selectByUdid(udid);
        orderVOList = orderPOList.stream().map(orderPO -> {
            OrderVO orderVO = new OrderVO();
            BeanUtils.copyProperties(orderPO, orderVO);
            return orderVO;
        }).collect(Collectors.toList());
        return orderVOList;
    }

    /**
     * 创建订单
     *
     * @param orderCreateRequest
     * @return
     */
    @Override
    public OrderVO createOrder(OrderCreateRequest orderCreateRequest) {
        if (StringUtils.isNotBlank(orderCreateRequest.getSkuInfo())
                && StringUtils.isNotBlank(orderCreateRequest.getUdid()) && orderCreateRequest.getTotalPrice() <= 0) {
            LOGGER.info("无法建单订单，参数不对,参数为{}", JSON.toJSON(orderCreateRequest));
            return null;
        }
        OrderPO orderPO = new OrderPO();
        BeanUtils.copyProperties(orderCreateRequest, orderPO);
        //orderPO = orderDao.createOrder(orderPO);
        orderPO.setCreateTime(new Date());
        orderPOMapper.insert(orderPO);
        OrderVO orderVO = new OrderVO();
        BeanUtils.copyProperties(orderPO, orderVO);
        return orderVO;
    }

    @Override
    public OrderVO queryOrderById(long orderId) {
        OrderVO orderVO = new OrderVO();
        BeanUtils.copyProperties(orderPOMapper.selectByPrimaryKey(orderId),orderVO);
        return orderVO;
    }


}
