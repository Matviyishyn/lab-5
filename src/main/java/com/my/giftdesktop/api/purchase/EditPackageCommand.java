package com.my.giftdesktop.api.purchase;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.PackageManager;

public class EditPackageCommand extends Command<PackageManager> {

    public EditPackageCommand(PackageManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().editPackage();
    }
}