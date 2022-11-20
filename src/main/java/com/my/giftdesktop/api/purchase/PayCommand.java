package com.my.giftdesktop.api.purchase;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.PaymentManager;

public class PayCommand extends Command<PaymentManager> {

    public PayCommand(PaymentManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().pay();
    }
}