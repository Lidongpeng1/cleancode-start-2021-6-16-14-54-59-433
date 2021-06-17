package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Address {
    private final String address;

    public Address(String address) {
        this.address = address;
    }

    private String getCity() {
        return this.address.substring(this.address.indexOf("省") + 1, this.address.indexOf("市"));
    }

    private String getProvince() {
        return this.address.substring(0, this.address.indexOf("省"));
    }
}
