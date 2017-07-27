package com.company.parsers;

import com.company.expressions.IGeneralExpression;

/**
 * Created by user on 27.07.2017
 */
public class SuperParser {

    String operation = "";

    IGeneralExpression expression;

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
