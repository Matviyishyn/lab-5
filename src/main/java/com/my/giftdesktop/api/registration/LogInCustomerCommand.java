package com.my.giftdesktop.api.registration;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.RegistrationManager;

public class LogInCustomerCommand extends Command<RegistrationManager> {

    public LogInCustomerCommand(RegistrationManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().logInUser();
    }
}
