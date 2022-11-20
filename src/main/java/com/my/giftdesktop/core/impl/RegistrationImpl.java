package com.my.giftdesktop.core.impl;

import com.my.giftdesktop.core.manager.RegistrationManager;
import com.my.giftdesktop.entity.user.CustomerEntity;
import com.my.giftdesktop.entity.user.ShopEntity;

public class RegistrationImpl implements RegistrationManager {
    @Override
    public void InitUserEntity(boolean isShop) {
        
    }

    @Override
    public boolean register() {
        return false;
    }

    @Override
    public boolean logInUser() {
        return false;
    }

    @Override
    public boolean logInShop() {
        return false;
    }

    @Override
    public boolean logOut() {
        return false;
    }

    @Override
    public CustomerEntity verifyUser() {
        return null;
    }

    @Override
    public ShopEntity verifyShop() {
        return null;
    }

    @Override
    public String errorMessage() {
        return null;
    }
}
