package com.my.giftdesktop.core.manager;

import com.my.giftdesktop.entity.item.AbstractItemEntity;

import java.util.List;

public interface LoyaltyManager {
    boolean setBonusProgram();
    boolean findBonus();
    void updateDatabase();
    List<AbstractItemEntity> getAllItemByShopId(long id);
}
