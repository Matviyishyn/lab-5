package com.my.giftdesktop.api.registration;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.RegistrationManager;

public class LogOutCommand extends Command<RegistrationManager> {

    public LogOutCommand(RegistrationManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().logOut();
    }
}
