package com.company;

public class OperationParser {

    public static String operation = "";

    public static boolean isEnd(char element) {
        return !Character.isDigit(element);
    }

    public static void apply(char element) {
        operation.concat(Character.toString(element));
    }

    public static NumParser startNewParser(char element) {
        NumParser parser = new NumParser();
        return parser;
    }
}