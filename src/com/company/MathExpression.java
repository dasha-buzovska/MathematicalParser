package com.company;
//має бути 2 класи з цими трьома методами, перший числовий, інший для додавання

import com.company.parsers.GeneralParser;
import com.company.parsers.MinusParser;
import com.company.parsers.NumParser;

import java.util.ArrayList;

class MathExpression {

    private ArrayList<GeneralParser> list = new ArrayList<>();

    private void addToList(GeneralParser element) {
        list.add(element);
    }

    /*void printList(){
        System.out.println(list.size());
        for (String aList : list) {
            System.out.println(aList);
        }
    }*/

    private GeneralParser parser;
    MathExpression(String expression) {
        if (Character.isDigit(expression.charAt(0))) {
            parser = new NumParser();
        } else {
            parser = new MinusParser();
        }
        for (int i = 0; i < expression.length(); i++) {
            char item = expression.charAt(i);
            if (parser.isEnd(item)) {
                addToList(parser);
                parser = parser.startNewParser(item);
            } else {
                parser.apply(item);
            }

        }
        addToList(parser);
        /*if (list.get(0).equals("-")) {
            list.add(0,"0");
        }*/
    }

    private String[] listOfOperations = new String[]{"*","-","+"};

    double CalculateFromList() {
        /*double number = 0;
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
        return number;*/
        double number = 0;

        while (list.size() > 1) {
            composeByPriority();
        }

        return list.get(0).getExpression().getValue();
    }

    public void composeByPriority() {
        byte max = getMaxPriority(list);
    }

    public byte getMaxPriority(ArrayList<GeneralParser> list) {
        byte max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPriority() > max) {
                max = list.get(i).getPriority();
            }
        }
        return max;
    }
}