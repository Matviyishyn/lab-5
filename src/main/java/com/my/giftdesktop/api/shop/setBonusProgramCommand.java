package com.my.giftdesktop.api.shop;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.LoyaltyManager;

public class setBonusProgramCommand extends Command<LoyaltyManager> {

    public setBonusProgramCommand(LoyaltyManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().setBonusProgram();
    }
}