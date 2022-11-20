package com.my.giftdesktop.core.manager;

import com.my.giftdesktop.entity.item.AbstractItemEntity;

import java.util.List;

public interface PackageManager {
    void updateStatistic(AbstractItemEntity abstractItem);
    long findItemIdByLabel(String label);
    boolean formPackage();
    boolean editPackage();
    boolean viewCard();
    boolean findItem();
    boolean deleteItemFromPackage(List<AbstractItemEntity> card, long id);
    AbstractItemEntity getItemById(long id);
}
