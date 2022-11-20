package com.my.giftdesktop.core.manager;

import com.my.giftdesktop.enums.PaymentMethod;

public interface PaymentManager {
    boolean pay();
    boolean cancelPay();
    boolean createOrder();
    boolean applyBonus();
    PaymentMethod choosePaymentMethod();
}
