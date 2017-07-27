package com.company;

import com.company.parsers.GeneralParser;
import com.company.parsers.NumParser;

import java.util.ArrayList;
//розберися з наслідуванням, подивись DivisionExpression, MinusExpression, PlusExpression, ProductExpression - в них є
// однаковий код, значить його можна винести в один класс і потім наслідуватись від нього. Зробиш це покажеш.



class MathExpression {

    private ArrayList<GeneralParser> list = new ArrayList<>();

    private void addToList(GeneralParser element) {
        list.add(element);
    }

    private GeneralParser parser;

    MathExpression(String expression) {
        parser = new NumParser();
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
    }

    double CalculateFromList() {
        while (list.size() > 1) {
            composeByPriority();
        }
        return list.get(0).getExpression().getValue();
    }

    public void composeByPriority() {
        int index = getMaxPriorityIndex(list);
        list.get(index).createExpression(list.get(index - 1).getExpression(), list.get(index + 1).getExpression());
        list.get(index).downgradePriority();
        list.remove(index + 1);
        list.remove(index - 1);
    }

    public int getMaxPriorityIndex(ArrayList<GeneralParser> list) {
        byte max = 0;
        int indexOfFirstMaxPriorityElement = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPriority() > max) {
                max = list.get(i).getPriority();
                indexOfFirstMaxPriorityElement = i;
            }
        }
        return indexOfFirstMaxPriorityElement;
    }
}