package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {
    static final int lowPriceRangelimit = 100;
    static final int middlePrice = 150;
    static final int highPriceRangeLimit = 400;
    static final double lowDiscount = 0.8;
    static final double highDiscount = 0.5;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= lowPriceRangelimit && cumulativeExpensesThisMonth < middlePrice) {
            return originalPrice * lowDiscount;
        }
        if (cumulativeExpensesThisMonth >= middlePrice && cumulativeExpensesThisMonth < highPriceRangeLimit) {
            return originalPrice * highDiscount;
        }
        return originalPrice;
    }
}
