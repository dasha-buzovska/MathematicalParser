package com.company;

import com.company.expressions.IGeneralExpression;
import com.company.expressions.NumberExpression;

public class NumParser implements GeneralParser {

    String number = "";

    public IGeneralExpression getExpression() {
        return new NumberExpression(Double.parseDouble(number));
    }

    public boolean isEnd(char element) {
        return !Character.isDigit(element);
    }

    public void apply(char element) {
        number = number.concat(Character.toString(element));
    }

    public GeneralParser startNewParser(char element) {
        if (element == '+') {
            PlusParser parser = new PlusParser();
            parser.apply(element);
            return parser;
        } else if (element == '-') {
            MinusParser parser = new MinusParser();
            parser.apply(element);
            return parser;
        }
        return null;
    }
}