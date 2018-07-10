package com.wangliang.photo.model.vo;

import java.util.Date;

/**
 * @author wangliang
 */
public class OrderVO {

    private Long id;

    private Integer orderStatus;

    private Integer pay_type;

    private Double total_price;

    private String skuInfo;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public String getSkuInfo() {
        return skuInfo;
    }

    public void setSkuInfo(String skuInfo) {
        this.skuInfo = skuInfo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "id=" + id +
                ", orderStatus=" + orderStatus +
                ", pay_type=" + pay_type +
                ", total_price=" + total_price +
                ", skuInfo='" + skuInfo + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
