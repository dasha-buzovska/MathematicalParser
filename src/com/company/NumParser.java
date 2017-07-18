package com.company;

public class NumParser implements GeneralParser {

    public String number = "";

    public String getElement() {
        return number;
    }

    public boolean isEnd(char element) {
        return !Character.isDigit(element);
    }

    public void apply(char element) {
        number = number.concat(Character.toString(element));
    }

    public GeneralParser startNewParser(char element) {
        OperationParser parser = new OperationParser();
        parser.apply(element);
        return parser;
    }
}