package com.my.giftdesktop.api.filter;

import com.my.giftdesktop.api.Command;
import com.my.giftdesktop.core.manager.FilterManager;

public class filterByPriceCommand extends Command<FilterManager> {

    public filterByPriceCommand(FilterManager manager) {
        super(manager);
    }

    @Override
    public boolean execute() {
        return getManager().filterByPrice();
    }
}