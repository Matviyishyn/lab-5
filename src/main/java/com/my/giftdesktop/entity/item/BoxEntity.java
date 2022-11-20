package com.my.giftdesktop.entity.item;

public class BoxEntity extends AbstractItemEntity {
    private int colorCode;
    private double scale;
    private double width;
    private double length;
    private String color;

    public BoxEntity(long id, long shopId, long categoryId, double price, double weight, double sugar, boolean isAvailable, String label, String description, int colorCode, double scale, double width, double length, String color) {
        super(id, shopId, categoryId, price, weight, sugar, isAvailable, label, description);
        this.colorCode = colorCode;
        this.scale = scale;
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public int getColorCode() {
        return colorCode;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
