package com.wangliang.photo.model.po;

import java.util.Date;

public class PhotoSpecPO {
    private Integer id;

    private String name;

    private String color;

    private String mmSize;

    private String pixelSize;

    private Integer dpi;

    private Integer type;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getMmSize() {
        return mmSize;
    }

    public void setMmSize(String mmSize) {
        this.mmSize = mmSize == null ? null : mmSize.trim();
    }

    public String getPixelSize() {
        return pixelSize;
    }

    public void setPixelSize(String pixelSize) {
        this.pixelSize = pixelSize == null ? null : pixelSize.trim();
    }

    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}