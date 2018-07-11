package com.wangliang.photo.service.impl;

import com.google.common.collect.Lists;
import com.wangliang.photo.dao.OrderDao;
import com.wangliang.photo.model.vo.OrderVO;
import com.wangliang.photo.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangliang
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    /**
     * 查询用户所有的订单
     *
     * @param udid
     * @return
     */
    @Override
    public List<OrderVO> queryAllUserOrder(String udid) {
        List<OrderVO> orderVOList = Lists.newArrayList();
        orderDao.queryAllUserOrder(udid);
        if (StringUtils.isEmpty(udid)) {

        }
        return orderVOList;
    }
}
