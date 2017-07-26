package com.company.parsers;

import com.company.expressions.*;

/**
 * Created by user on 24.07.2017
 */
public class ProductParser implements GeneralParser {

    byte priority = 2;

    public byte getPriority() {
        return priority;
    }

    public void downgradePriority() {
        priority = 0;
    }

    IGeneralExpression expression;

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new ProductExpression(left, right);
    }

    public IGeneralExpression getExpression() {
        return expression;
    }

    String operation = "";

    public boolean isEnd(char element) {
        return Character.isDigit(element);
    }

    public void apply(char element) {
        operation = operation.concat(Character.toString(element));
    }

    public GeneralParser startNewParser(char element) {
        NumParser parser = new NumParser();
        parser.apply(element);
        return parser;
    }
}
