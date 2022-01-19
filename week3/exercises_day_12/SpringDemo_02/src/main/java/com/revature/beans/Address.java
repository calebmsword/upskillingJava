package com.revature.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
    String fullAddress;

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public Address(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public Address() {
        fullAddress = "This is full address";
    }

    @Override
    public String toString() {
        return "Address{" +
                "fullAddress='" + fullAddress + '\'' +
                '}';
    }
}
