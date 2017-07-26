package com.company.parsers;

import com.company.expressions.IGeneralExpression;
import com.company.expressions.MinusExpression;

/**
 * Created by user on 24.07.2017
 */
public class MinusParser implements GeneralParser {

    byte priority = 1;

    public byte getPriority() {
        return priority;
    }

    public void downgradePriority() {
        priority = 0;
    }

    IGeneralExpression expression;

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new MinusExpression(left, right);
    }

    public IGeneralExpression getExpression() {
        return expression;
    }

    public boolean isEnd(char element) {
        return Character.isDigit(element);
    }

    String minus = "";

    public void apply(char element) {
        minus = minus.concat(Character.toString(element));
    }

    public GeneralParser startNewParser(char element) {
        NumParser parser = new NumParser();
        parser.apply(element);
        return parser;
    }
}