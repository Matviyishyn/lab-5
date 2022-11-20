package com.my.giftdesktop.entity.user;

import com.my.giftdesktop.enums.AccessLevel;
import com.my.giftdesktop.enums.ShopStatus;

public class ShopEntity extends AbstractUserEntity {

    private long countryId;
    private long loyaltyProvidedId;
    private long statisticId;
    private String brand;
    private ShopStatus status;
    private String shopDescription;

    public ShopEntity(long id, boolean isVerified, String email, String password, AccessLevel accessLevel, long countryId, long loyaltyProvidedId, long statisticId, String brand, ShopStatus status, String shopDescription) {
        super(id, isVerified, email, password, accessLevel);
        this.countryId = countryId;
        this.loyaltyProvidedId = loyaltyProvidedId;
        this.statisticId = statisticId;
        this.brand = brand;
        this.status = status;
        this.shopDescription = shopDescription;
    }

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public long getLoyaltyProvidedId() {
        return loyaltyProvidedId;
    }

    public void setLoyaltyProvidedId(long loyaltyProvidedId) {
        this.loyaltyProvidedId = loyaltyProvidedId;
    }

    public long getStatisticId() {
        return statisticId;
    }

    public void setStatisticId(long statisticId) {
        this.statisticId = statisticId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ShopStatus getStatus() {
        return status;
    }

    public void setStatus(ShopStatus status) {
        this.status = status;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }
}
