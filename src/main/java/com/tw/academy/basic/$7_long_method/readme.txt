1. 订单变量命名，从 o -> order
2. printCustomerName方法没有被调用，注解标记已过期，删除
3. 通过查看代码可以理解其中意思，注解多余，去除
4. line 11-14
    修改税率，打印字符串等魔法数字
    private final double TAX_RATE =  .10;
    private final String PRINT_HEADER_STRING = "======Printing Orders======\n";
    private final String SALES_TAX_STRING = "Sales Tax";
    private final String TOTAL_AMOUNT_STRING = "Total Amount";
5. 输出内容String命名不规范 line 24
    从output rename为 orderReceiptContent
6. 将打印头部抽取为公共方法getReceiptHeader() Line 27  -->  52~56
7. 将每个Order Item的信息打印抽取为公共方法getOrderItemContent()
8. 将总共要交的税打印 抽取为公共方法 getReceiptTotSalesTx()
9. 将总共的价格打印 抽取为公共方法 getTotalAmount()
10. 将 \t \n等字符抽取为公共字符变量
11. 将每个订单item的税值计算抽取为公共方法lineItem.totalAmount() * TAX_RATE; -> calculateOrderItemSalesTax
12. 将每个订单item的金额计算抽取为公共方法calculateOrderItemAmount()
13. 将打印体抽取为公共方法getReceiptBody()
14. naming将totSalesTx 和 tot修改为 totalSalesTax 和 TotalAmount
15. 修改printReceipt方法名，修改为getReceiptContent 更加表意