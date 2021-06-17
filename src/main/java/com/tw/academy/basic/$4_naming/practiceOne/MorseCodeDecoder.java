package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {
    static final String spacetring = " ";
    static final String nullstring = "null";


    public static String decode(String input) {
        // 匹配两个及以上空白字符
        String moreThanTwoWhiteChart = "\\s{2,}";
        String[] separatedInputStrings = input.split(moreThanTwoWhiteChart);
        StringBuilder encodedStringResult = new StringBuilder();
        for (String s : separatedInputStrings) {
            // 匹配一个空白字符
            String spaceChart = " ";
            String [] waitDecondeChatItems = s.split(spaceChart);
            for (String waitDecondeChatItem: waitDecondeChatItems) {
                encodedStringResult.append(MorseCode.get(waitDecondeChatItem));
            }
            encodedStringResult.append(spacetring);
        }
        return encodedStringResult.toString().replaceAll(nullstring, "").trim();
    }
}
