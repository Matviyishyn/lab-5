package com.my.giftdesktop.api.shop;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.LoyaltyManager;

public class editBonusCommand extends Command<LoyaltyManager> {

    public editBonusCommand(LoyaltyManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().findBonus();
    }
}