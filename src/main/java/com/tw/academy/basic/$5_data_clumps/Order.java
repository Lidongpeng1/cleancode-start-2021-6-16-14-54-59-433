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

    public Order(int orderNumber, String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.orderNumber = orderNumber;

        this.buyer = new Buyer(buyerName,buyerPhoneNumber,buyerAddress);

        this.buyerName = buyerName;
        this.buyerPhoneNumber = buyerPhoneNumber;
        this.buyerAddress = buyerAddress;
    }

    public String confirm(){
        return buyer.confirm();
    }
}

