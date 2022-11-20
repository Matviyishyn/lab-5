package com.my.giftdesktop.api.filter;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.FilterManager;

public class filterByIdCommand extends Command<FilterManager> {

    public filterByIdCommand(FilterManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().filterById();
    }
}