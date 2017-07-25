package com.company.parsers;

import com.company.expressions.IGeneralExpression;
import com.company.expressions.PlusExpression;

/**
 * Created by user on 24.07.2017
 */
public class PlusParser implements GeneralParser {

    String operation = "";

    IGeneralExpression expression;

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new PlusExpression(left, right);
    }

    public byte getPriority() {
        return 1;
    }

    public IGeneralExpression getExpression() {
        return expression;
    }

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
