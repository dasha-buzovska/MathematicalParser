package com.company.parsers;

import com.company.expressions.DivisionExpression;
import com.company.expressions.IGeneralExpression;

/**
 * Created by user on 26.07.2017
 */
public class DivisionParser implements GeneralParser {

    byte priority = 2;

    public byte getPriority() {
        return priority;
    }

    public void downgradePriority() {
        priority = 0;
    }

    IGeneralExpression expression;

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new DivisionExpression(left, right);
    }

    public IGeneralExpression getExpression() {
        return expression;
    }

    public boolean isEnd(char element) {
        return Character.isDigit(element);
    }

    String divide = "";

    public void apply(char element) {
        divide = divide.concat(Character.toString(element));
    }

    public GeneralParser startNewParser(char element) {
        NumParser parser = new NumParser();
        parser.apply(element);
        return parser;
    }
}
