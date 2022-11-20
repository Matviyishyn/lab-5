package com.my.giftdesktop.entity.item;

import java.util.List;

public class CookiesEntity extends AbstractItemEntity{
    private double weight;
    private List<String> components;

    public CookiesEntity(long id, long shopId, long categoryId, double price, double weight, double sugar, boolean isAvailable, String label, String description, double weight1, List<String> components) {
        super(id, shopId, categoryId, price, weight, sugar, isAvailable, label, description);
        this.weight = weight1;
        this.components = components;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }
}
