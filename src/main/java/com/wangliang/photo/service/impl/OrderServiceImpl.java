package com.wangliang.photo.service.impl;

import com.wangliang.photo.dao.OrderDao;
import com.wangliang.photo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wangliang
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

}
