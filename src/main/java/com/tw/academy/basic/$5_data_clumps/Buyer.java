package com.tw.academy.basic.$5_data_clumps;

public class Buyer {
    public String getBuyerName() {
        return buyerName;
    }

    public String getBuyerPhoneNumber() {
        return buyerPhoneNumber;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    private String buyerName;
    private String buyerPhoneNumber;
    private String buyerAddress;

    public Buyer(String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.buyerName = buyerName;
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", getBuyerName(), getBuyerPhoneNumber(), getBuyerAddress());
    }
}
