package com.my.giftdesktop.entity.user;

import com.my.giftdesktop.enums.AccessLevel;

public class AbstractUserEntity {
    private long id;
    private boolean isVerified;
    private String email;
    private String password;
    private AccessLevel accessLevel;

    public AbstractUserEntity(long id, boolean isVerified, String email, String password, AccessLevel accessLevel) {
        this.id = id;
        this.isVerified = isVerified;
        this.email = email;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }
}