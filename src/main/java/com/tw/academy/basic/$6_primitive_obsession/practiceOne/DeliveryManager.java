package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private Address from;
    private Address to;

    public DeliveryManager(String fromAddress, String toAddress) {
        this.from = new Address(fromAddress);
        this.to = new Address(toAddress);
    }

    public DeliverCenter allocate(){
        if (isEqualsProvince() && isEqualsCity()){
            return DeliverCenter.LOCAL;
        }
        if (isEqualsProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isEqualsCity() {
        return to.getCity().equals(from.getCity());
    }

    private boolean isEqualsProvince() {
        return to.getProvince().equals(from.getProvince());
    }

}
