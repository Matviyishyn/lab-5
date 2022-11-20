package com.my.giftdesktop.entity.item;

public abstract class AbstractItemEntity {
    private long id;
    private long shopId;
    private long categoryId;
    private double price;
    private double weight;
    private double sugar;
    private boolean isAvailable;
    private String label;
    private String description;

    public AbstractItemEntity(long id, long shopId, long categoryId, double price, double weight, double sugar, boolean isAvailable, String label, String description) {
        this.id = id;
        this.shopId = shopId;
        this.categoryId = categoryId;
        this.price = price;
        this.weight = weight;
        this.sugar = sugar;
        this.isAvailable = isAvailable;
        this.label = label;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
