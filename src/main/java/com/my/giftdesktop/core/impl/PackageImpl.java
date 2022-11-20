package com.my.giftdesktop.core.impl;

import com.my.giftdesktop.core.manager.PackageManager;
import com.my.giftdesktop.entity.item.AbstractItemEntity;

import java.util.List;

public class PackageImpl implements PackageManager {

    @Override
    public void updateStatistic(AbstractItemEntity abstractItem) {

    }

    @Override
    public long findItemIdByLabel(String label) {
        return 0;
    }

    @Override
    public boolean formPackage() {
        return false;
    }

    @Override
    public boolean editPackage() {
        return false;
    }

    @Override
    public boolean viewCard() {
        return false;
    }

    @Override
    public boolean findItem() {
        return false;
    }

    @Override
    public boolean deleteItemFromPackage(List<AbstractItemEntity> card, long id) {
        return false;
    }

    @Override
    public AbstractItemEntity getItemById(long id) {
        return null;
    }
}
