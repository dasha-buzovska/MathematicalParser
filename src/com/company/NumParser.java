package com.company;

public class NumParser {

    public static String number = "";

    public static String getNumber() {
        return number;
    }

    public static boolean isEnd(char element) {
        return !Character.isDigit(element);
    }

    public static void apply(char element) {
        number.concat(Character.toString(element));
    }

    public static OperationParser startNewParser(char element) {
        OperationParser parser = new OperationParser();
        return parser;
    }
}