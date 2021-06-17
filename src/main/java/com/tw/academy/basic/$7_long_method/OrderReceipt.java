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

    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    //todo: rename -- Tom
    public String printReceipt() {
        StringBuilder orderReceiptContent = new StringBuilder();
        getReceiptHeader(orderReceiptContent);
        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            getOrderItemContent(orderReceiptContent, lineItem);
            double salesTax = lineItem.totalAmount() * TAX_RATE;
            totSalesTx += salesTax;
            tot += lineItem.totalAmount() + salesTax;
        }
        getReceiptTotSalesTx(orderReceiptContent, totSalesTx);
        getTotalAmount(orderReceiptContent, tot);
        return orderReceiptContent.toString();
    }

    private StringBuilder getTotalAmount(StringBuilder orderReceiptContent, double tot) {
        return orderReceiptContent.append(TOTAL_AMOUNT_STRING).append('\t').append(tot);
    }

    private StringBuilder getReceiptTotSalesTx(StringBuilder orderReceiptContent, double totSalesTx) {
        return orderReceiptContent.append(SALES_TAX_STRING).append('\t').append(totSalesTx);
    }

    private void getOrderItemContent(StringBuilder orderReceiptContent, LineItem lineItem) {
        orderReceiptContent.append(lineItem.getDescription());
        orderReceiptContent.append('\t');
        orderReceiptContent.append(lineItem.getPrice());
        orderReceiptContent.append('\t');
        orderReceiptContent.append(lineItem.getQuantity());
        orderReceiptContent.append('\t');
        orderReceiptContent.append(lineItem.totalAmount());
        orderReceiptContent.append('\n');
    }

    private void getReceiptHeader(StringBuilder orderReceiptContent) {
        orderReceiptContent.append(PRINT_HEADER_STRING);
        orderReceiptContent.append(order.getCustomerName());
        orderReceiptContent.append(order.getCustomerAddress());
    }
}