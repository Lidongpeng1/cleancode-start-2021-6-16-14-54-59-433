package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private Address from;
    private Address to;

    String toAddress;
    String fromAddress;

    public DeliveryManager(String fromAddress, String toAddress) {
        this.toAddress = toAddress;
        this.fromAddress = fromAddress;

        this.from = new Address(fromAddress);
        this.to = new Address(toAddress);
    }

    public DeliverCenter allocate(){
        if (to.getProvince().equals(from.getProvince()) && to.getCity().equals(from.getCity())){
            return DeliverCenter.LOCAL;
        }
        if (to.getProvince().equals(from.getProvince())) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }
}
