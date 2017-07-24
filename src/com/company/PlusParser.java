package com.company;

import com.company.expressions.IGeneralExpression;
import com.company.expressions.NumberExpression;

/**
 * Created by user on 24.07.2017
 */
public class PlusParser implements GeneralParser{

    String operation = "";

    public IGeneralExpression getExpression() {
        return new NumberExpression(Double.parseDouble(operation));
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
