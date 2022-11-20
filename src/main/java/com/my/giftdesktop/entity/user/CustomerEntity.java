package com.my.giftdesktop.entity.user;

import com.my.giftdesktop.enums.AccessLevel;
import com.my.giftdesktop.enums.CustomerStatus;

public class CustomerEntity extends AbstractUserEntity {
    private long cartId;
    private CustomerStatus status;
    private final CustomerIdentityEntity customerIdentity;

    public CustomerEntity(long id, boolean isVerified, String email, String password, AccessLevel accessLevel, long cartId, CustomerStatus status, String name, String surname, String phone, String address) {
        super(id, isVerified, email, password, accessLevel);
        this.cartId = cartId;
        this.status = status;
        this.customerIdentity = new CustomerIdentityEntity(name, surname, phone, address);
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public CustomerStatus getStatus() {
        return status;
    }

    public void setStatus(CustomerStatus status) {
        this.status = status;
    }

    public CustomerIdentityEntity getCustomerIdentity() {
        return customerIdentity;
    }
}
