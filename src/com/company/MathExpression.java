package com.company;
//має бути 2 класи з цими трьома методами, перший числовий, інший для додавання

import java.util.ArrayList;

public class MathExpression {

    private static ArrayList<String> list;

    private static void addToList(String element) {
        list.add(element);
    }

    public static void printList(){
        for (String aList : list) {
            System.out.println(aList);
        }
    }

    public static Object parser;
    public MathExpression(String expression) {
        NumParser parser = new NumParser();
        for (int i = 0; i < expression.length(); i++) {
            char item = expression.charAt(i);
            if (parser.isEnd(item)) {
                parser = (NumParser) parser.startNewParser(item); //
                addToList(parser.getElement());
            } else {
                parser.apply(item);
            }
        }
    }
}