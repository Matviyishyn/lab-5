package com.my.giftdesktop.api.purchase;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.PaymentManager;

public class CancelPayCommand extends Command<PaymentManager> {

    public CancelPayCommand(PaymentManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().cancelPay();
    }
}