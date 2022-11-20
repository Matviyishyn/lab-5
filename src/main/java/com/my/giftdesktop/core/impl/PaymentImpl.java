package com.my.giftdesktop.core.impl;

import com.my.giftdesktop.core.manager.PaymentManager;
import com.my.giftdesktop.enums.PaymentMethod;

public class PaymentImpl implements PaymentManager {
    @Override
    public boolean pay() {
        return false;
    }

    @Override
    public boolean cancelPay() {
        return false;
    }

    @Override
    public boolean createOrder() {
        return false;
    }

    @Override
    public boolean applyBonus() {
        return false;
    }

    @Override
    public PaymentMethod choosePaymentMethod() {
        return null;
    }
}
