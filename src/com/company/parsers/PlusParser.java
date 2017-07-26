package com.company.parsers;

import com.company.expressions.IGeneralExpression;
import com.company.expressions.PlusExpression;

/**
 * Created by user on 24.07.2017
 */
public class PlusParser implements GeneralParser {

    byte priority = 1;

    public byte getPriority() {
        return priority;
    }

    public void downgradePriority() {
        priority = 0;
    }

    IGeneralExpression expression;

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new PlusExpression(left, right);
    }

    public IGeneralExpression getExpression() {
        return expression;
    }

    String plus = "";

    public boolean isEnd(char element) {
        return Character.isDigit(element);
    }

    public void apply(char element) {
        plus = plus.concat(Character.toString(element));
    }

    public GeneralParser startNewParser(char element) {
        NumParser parser = new NumParser();
        parser.apply(element);
        return parser;
    }
}
