package com.my.giftdesktop.api.shop;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.EditManager;

public class editItemCommand extends Command<EditManager> {

    public editItemCommand(EditManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().editItem();
    }
}