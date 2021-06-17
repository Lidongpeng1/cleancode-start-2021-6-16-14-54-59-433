1. 订单变量命名，从 o -> order
2. printCustomerName方法没有被调用，注解标记已过期，删除
3. 通过查看代码可以理解其中意思，注解多余，去除
4. 修改税率，打印字符串等魔法数字
    private final double TAX_RATE =  .10;
    private final String PRINT_HEADER_STRING = "======Printing Orders======\n";
    private final String SALES_TAX_STRING = "Sales Tax";
    private final String TOTAL_AMOUNT_STRING = "Total Amount";
