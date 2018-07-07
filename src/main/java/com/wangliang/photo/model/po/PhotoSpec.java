package com.wangliang.photo.model.po;

import java.util.Date;

/**
 * @author wangliang
 */
public class PhotoSpec {

    private long id;

    private String color;

    private String name;

    private String mmSize;

    private String pixelSize;

    private int dpi;

    private int type;

    private Date createTime;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMmSize() {
        return mmSize;
    }

    public void setMmSize(String mmSize) {
        this.mmSize = mmSize;
    }

    public String getPixelSize() {
        return pixelSize;
    }

    public void setPixelSize(String pixelSize) {
        this.pixelSize = pixelSize;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
