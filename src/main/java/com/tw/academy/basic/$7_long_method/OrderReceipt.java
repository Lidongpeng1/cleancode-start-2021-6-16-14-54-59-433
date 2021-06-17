package com.tw.academy.basic.$7_long_method;

/**
 * This class is a example for bad smell;
 *
 * @author  Thoughtworks
 * @version 1.0
 * @since   2018-1-1
 */
public class OrderReceipt {
    private final double TAX_RATE =  .10;
    private final String PRINT_HEADER_STRING = "======Printing Orders======\n";
    private final String SALES_TAX_STRING = "Sales Tax";
    private final String TOTAL_AMOUNT_STRING = "Total Amount";
    private final char SEPARATOR = '\t';
    private final char LINE_RETURN = '\n';

    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder orderReceiptContent = new StringBuilder();
        getReceiptHeader(orderReceiptContent);
        getReceiptBody(orderReceiptContent);
        return orderReceiptContent.toString();
    }

    private void getReceiptBody(StringBuilder orderReceiptContent) {
        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            getOrderItemContent(orderReceiptContent, lineItem);
            totSalesTx += calculateOrderItemSalesTax(lineItem);
            tot += calculateOrderItemAmount(lineItem);
        }
        getReceiptTotSalesTx(orderReceiptContent, totSalesTx);
        getTotalAmount(orderReceiptContent, tot);
    }

    private double calculateOrderItemAmount(LineItem lineItem) {
        return lineItem.totalAmount() + calculateOrderItemSalesTax(lineItem);
    }

    private double calculateOrderItemSalesTax(LineItem lineItem) {
        return lineItem.totalAmount() * TAX_RATE;
    }

    private StringBuilder getTotalAmount(StringBuilder orderReceiptContent, double tot) {
        return orderReceiptContent.append(TOTAL_AMOUNT_STRING).append(SEPARATOR).append(tot);
    }

    private StringBuilder getReceiptTotSalesTx(StringBuilder orderReceiptContent, double totSalesTx) {
        return orderReceiptContent.append(SALES_TAX_STRING).append(SEPARATOR).append(totSalesTx);
    }

    private void getOrderItemContent(StringBuilder orderReceiptContent, LineItem lineItem) {
        orderReceiptContent.append(lineItem.getDescription());
        orderReceiptContent.append(SEPARATOR);
        orderReceiptContent.append(lineItem.getPrice());
        orderReceiptContent.append(SEPARATOR);
        orderReceiptContent.append(lineItem.getQuantity());
        orderReceiptContent.append(SEPARATOR);
        orderReceiptContent.append(lineItem.totalAmount());
        orderReceiptContent.append(LINE_RETURN);
    }

    private void getReceiptHeader(StringBuilder orderReceiptContent) {
        orderReceiptContent.append(PRINT_HEADER_STRING);
        orderReceiptContent.append(order.getCustomerName());
        orderReceiptContent.append(order.getCustomerAddress());
    }
}