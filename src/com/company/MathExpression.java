package com.company;
//має бути 2 класи з цими трьома методами, перший числовий, інший для додавання

import java.util.ArrayList;

class MathExpression {

    private ArrayList<String> list = new ArrayList<>();

    private void addToList(String element) {
        list.add(element);
    }

    void printList(){
        System.out.println(list.size());
        for (String aList : list) {
            System.out.println(aList);
        }
    }

    private GeneralParser parser;
    MathExpression(String expression) {
        parser = new NumParser();
        for (int i = 0; i < expression.length(); i++) {
            char item = expression.charAt(i);
            if (parser.isEnd(item)) {
                addToList(parser.getElement());
                parser = parser.startNewParser(item);
            } else {
                parser.apply(item);
            }

        }
        addToList(parser.getElement());
    }
}