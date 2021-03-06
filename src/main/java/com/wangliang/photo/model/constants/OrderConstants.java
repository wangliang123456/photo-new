package com.wangliang.photo.model.constants;

/**
 * 常量定义
 * @author wangliang
 */
public interface OrderConstants {

    interface OrderStatus {
        int WAITING_PAY = 0;
        int PAID = 1;
        int DELETE = 2;
        int FINISHED = 3;
        int WAITING_DELIVERY = 4;
        int DELIVERY = 5;
    }
}
