package com.my.giftdesktop.api.registration;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.RegistrationManager;

public class LogInShopCommand extends Command<RegistrationManager> {

    public LogInShopCommand(RegistrationManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().logInShop();
    }
}
