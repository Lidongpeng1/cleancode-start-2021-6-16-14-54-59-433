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
        StringBuilder output = new StringBuilder();

        output.append(PRINT_HEADER_STRING);

        output.append(order.getCustomerName());
        output.append(order.getCustomerAddress());

        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append('\t');
            output.append(lineItem.getPrice());
            output.append('\t');
            output.append(lineItem.getQuantity());
            output.append('\t');
            output.append(lineItem.totalAmount());
            output.append('\n');

            double salesTax = lineItem.totalAmount() * TAX_RATE;
            totSalesTx += salesTax;

            tot += lineItem.totalAmount() + salesTax;
        }

        output.append(SALES_TAX_STRING).append('\t').append(totSalesTx);

        output.append(TOTAL_AMOUNT_STRING).append('\t').append(tot);
        return output.toString();
    }
}