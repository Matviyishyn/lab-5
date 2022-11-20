package com.my.giftdesktop.entity.item;

public class ChocolateEntity extends AbstractItemEntity {
    private String brand;
    private String chocolateType;

    public ChocolateEntity(long id, long shopId, long categoryId, double price, double weight, double sugar, boolean isAvailable, String label, String description, String brand, String chocolateType) {
        super(id, shopId, categoryId, price, weight, sugar, isAvailable, label, description);
        this.brand = brand;
        this.chocolateType = chocolateType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }
}
