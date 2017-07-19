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
        if (Character.isDigit(expression.charAt(0))) {
            parser = new NumParser();
        } else {
            parser = new OperationParser();
        }
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
        if (list.get(0).equals("-")) {
            list.add(0,"0");
        }
    }

    private String[] listOfOperations = new String[]{"*","-","+"};

    double CalculateFromList() {
        double number = 0;
        int j = 0;
        while (list.size() >= 3 || j < listOfOperations.length) {
            for (int i = 1; i < list.size() - 1; i++) {
                if (list.get(i).equals(listOfOperations[j])) {
                    NodeNumber node = new NodeNumber(list.get(i-1),list.get(i),list.get(i+1));
                    number = node.getResult();
                    list.remove(i+1);
                    list.remove(i);
                    list.remove(i-1);
                    list.add(i-1, "" + number);
                    i = i - 2;
                }
            }
            j++;
        }
        System.out.println(number);
        return number;
    }
}