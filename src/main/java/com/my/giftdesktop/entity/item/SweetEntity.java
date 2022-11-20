package com.my.giftdesktop.entity.item;

public class SweetEntity extends ChocolateEntity {
    private int amount;
    private double weightByOne;
    private String stuffing;

    public SweetEntity(long id, long shopId, long categoryId, double price, double sugar, boolean isAvailable, String label, String description, String brand, String chocolateType, int amount, double weightByOne, String stuffing) {
        super(id, shopId, categoryId, price, (weightByOne * amount), sugar, isAvailable, label, description, brand, chocolateType);
        this.amount = amount;
        this.weightByOne = weightByOne;
        this.stuffing = stuffing;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getWeightByOne() {
        return weightByOne;
    }

    public void setWeightByOne(double weightByOne) {
        this.weightByOne = weightByOne;
    }

    public String getStuffing() {
        return stuffing;
    }

    public void setStuffing(String stuffing) {
        this.stuffing = stuffing;
    }
}
