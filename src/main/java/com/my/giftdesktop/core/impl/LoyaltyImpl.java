package com.my.giftdesktop.core.impl;

import com.my.giftdesktop.core.manager.LoyaltyManager;
import com.my.giftdesktop.entity.item.AbstractItemEntity;

import java.util.List;

public class LoyaltyImpl implements LoyaltyManager {
    @Override
    public boolean setBonusProgram() {
        return false;
    }

    @Override
    public boolean findBonus() {
        return false;
    }

    @Override
    public void updateDatabase() {

    }

    @Override
    public List<AbstractItemEntity> getAllItemByShopId(long id) {
        return null;
    }
}
