package com.my.giftdesktop.api.purchase;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.PackageManager;

public class ViewCardCommand extends Command<PackageManager> {

    public ViewCardCommand(PackageManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().viewCard();
    }
}