package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;
    private Buyer buyer;

    public String getBuyerName() {
        return buyer.getBuyerName();
    }

    public String getBuyerPhoneNumber() {
        return buyer.getBuyerPhoneNumber();
    }

    public String getBuyerAddress() {
        return buyer.getBuyerAddress();
    }

    private String buyerName;
    private String buyerPhoneNumber;
    private String buyerAddress;

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public void setBuyerPhoneNumber(String buyerPhoneNumber) {
        this.buyerPhoneNumber = buyerPhoneNumber;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;

        this.buyer = new Buyer(buyerName,buyerPhoneNumber,buyerAddress);

        setBuyerName(buyer.getBuyerName());
        setBuyerPhoneNumber(buyer.getBuyerPhoneNumber());
        setBuyerAddress(buyer.getBuyerAddress());
    }

    public String confirm(){
        return buyer.confirm();
    }
}

