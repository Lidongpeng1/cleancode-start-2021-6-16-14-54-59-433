package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {
    private static final int LOW_PRICE_RANGE_LIMIT = 100;
    private static final int MIDDLE_PRICE = 150;
    private static final int HIGH_PRICE_RANGE_LIMIT = 400;
    private static final double LOW_DISCOUNT = 0.8;
    private static final double HIGH_DISCOUNT = 0.5;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= LOW_PRICE_RANGE_LIMIT && cumulativeExpensesThisMonth < MIDDLE_PRICE) {
            return originalPrice * LOW_DISCOUNT;
        }
        if (cumulativeExpensesThisMonth >= MIDDLE_PRICE && cumulativeExpensesThisMonth < HIGH_PRICE_RANGE_LIMIT) {
            return originalPrice * HIGH_DISCOUNT;
        }
        return originalPrice;
    }
}
