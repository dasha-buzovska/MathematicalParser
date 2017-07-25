package com.company.parsers;

import com.company.expressions.IGeneralExpression;
import com.company.expressions.MinusExpression;

/**
 * Created by user on 24.07.2017
 */
public class MinusParser implements GeneralParser {
    String minus = "";

    IGeneralExpression expression;

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new MinusExpression(left, right);
    }

    public IGeneralExpression getExpression() {
        return expression;
    }

    public byte getPriority() {
        return 1;
    }

    public boolean isEnd(char element) {
        return Character.isDigit(element);
    }

    public void apply(char element) {
        minus = minus.concat(Character.toString(element));
    }

    public GeneralParser startNewParser(char element) {
        NumParser parser = new NumParser();
        parser.apply(element);
        return parser;
    }
}
