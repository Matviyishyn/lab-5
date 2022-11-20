package com.my.giftdesktop.core.manager;

import com.my.giftdesktop.entity.user.CustomerEntity;
import com.my.giftdesktop.entity.user.ShopEntity;

public interface RegistrationManager {
    void InitUserEntity(boolean isShop);
    boolean register();
    boolean logInUser();
    boolean logInShop();
    boolean logOut();
    CustomerEntity verifyUser();
    ShopEntity verifyShop();
    String errorMessage();
}
