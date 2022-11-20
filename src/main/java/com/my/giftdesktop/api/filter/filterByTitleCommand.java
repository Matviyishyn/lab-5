package com.my.giftdesktop.api.filter;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.FilterManager;

public class filterByTitleCommand extends Command<FilterManager> {

    public filterByTitleCommand(FilterManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().filterByTitle();
    }
}