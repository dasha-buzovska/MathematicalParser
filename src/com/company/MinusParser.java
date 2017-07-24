package com.company;

import com.company.expressions.IGeneralExpression;
import com.company.expressions.NumberExpression;

/**
 * Created by user on 24.07.2017
 */
public class MinusParser implements GeneralParser {
    String minus = "";

    public IGeneralExpression getExpression() {
        return new NumberExpression(Double.parseDouble(minus));
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
