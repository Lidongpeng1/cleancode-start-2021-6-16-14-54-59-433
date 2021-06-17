package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {

    private static final String LETTER_SEPARATOR = " ";
    private static final String REGEX_TWO_AND_MORE_SPACE = "\\s{2,}";
    private static final String NONE_MORSE_CODE_CHAR = "null";
    private static final String WORD_SEPARATOR = " ";

    public static String decode(String input) {
        String[] words = input.split(REGEX_TWO_AND_MORE_SPACE);
        StringBuilder decodedMorseCode = new StringBuilder();
        for (String word : words) {
            String [] singleLetters = word.split(LETTER_SEPARATOR);
            for (String singleLetter: singleLetters) {
                decodedMorseCode.append(MorseCode.get(singleLetter));
            }
            decodedMorseCode.append(WORD_SEPARATOR);
        }
        return ignoreNoneMorseChar(decodedMorseCode);
    }

    private static String ignoreNoneMorseChar(StringBuilder decodedMorseCode) {
        return decodedMorseCode.toString().replaceAll(NONE_MORSE_CODE_CHAR, "").trim();
    }
}
