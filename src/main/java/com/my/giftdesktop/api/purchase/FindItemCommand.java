package com.my.giftdesktop.api.purchase;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.PackageManager;

public class FindItemCommand extends Command<PackageManager> {

    public FindItemCommand(PackageManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().findItem();
    }
}