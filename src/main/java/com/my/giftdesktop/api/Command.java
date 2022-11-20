package com.my.giftdesktop.api;

public abstract class Command<T> {
    private T manager;

    public T getManager() {
        return manager;
    }

    public Command(T manager) {
        this.manager = manager;
    }

    public abstract boolean execute();
}