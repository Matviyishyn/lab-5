package com.my.giftdesktop.api.filter;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.FilterManager;

public class filterBySugarCommand extends Command<FilterManager> {

    public filterBySugarCommand(FilterManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().filterBySugar();
    }
}