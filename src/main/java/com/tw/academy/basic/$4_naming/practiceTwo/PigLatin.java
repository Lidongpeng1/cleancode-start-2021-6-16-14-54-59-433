package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {
    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    private static final String DELIMETER = " ";
    private static final String SUFFIX =  "ay";

    public static String pigIt(String sentence) {
        String[] punctuationMarks={".",",","-",":",";","!","?"};
        String[] strings = sentence.split(DELIMETER);
        char startChar;
        boolean notContainsMark = true;
        for (int index = 0; index < strings.length; index++){
            for (String mark : punctuationMarks)
                if (strings[index].contains(mark)) {
                    notContainsMark = false;
                    break;
                }
            if (notContainsMark){
                startChar = strings[index].charAt(0);
                strings[index] = strings[index].substring(1)+startChar+SUFFIX;
            }
            notContainsMark = true;
        }

        return String.join(DELIMETER, strings);
    }
}
