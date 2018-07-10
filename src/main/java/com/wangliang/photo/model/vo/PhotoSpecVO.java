package com.wangliang.photo.model.vo;

/**
 * @author wangliang
 */
public class PhotoSpecVO {

    private Long id;

    private String color;

    private String name;

    private String mmSize;

    private String pixelSize;

    private Integer dpi;

    private int type;

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

    @Override
    public String toString() {
        return "PhotoSpecVO{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", mmSize='" + mmSize + '\'' +
                ", pixelSize='" + pixelSize + '\'' +
                ", dpi=" + dpi +
                ", type=" + type +
                '}';
    }
}
