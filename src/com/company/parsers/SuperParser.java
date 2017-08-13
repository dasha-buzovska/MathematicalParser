package com.company.parsers;

import com.company.ParserException;
import com.company.expressions.IGeneralExpression;

/**
 * Created by user on 27.07.2017
 */
public abstract class SuperParser implements GeneralParser {

    byte priority;

    public byte getPriority() {
        return priority;
    }

    public void downgradePriority() {
        priority = 0;
    }

    IGeneralExpression expression;

    public IGeneralExpression getExpression() {
        return expression;
    }

    public abstract void createExpression(IGeneralExpression left, IGeneralExpression right);

    public boolean isEnd(char element) {
        return true;
    }

    public void apply(char element) {}


    public GeneralParser startNewParser(char element) throws ParserException {
        if (Character.isDigit(element)) {
            NumParser parser = new NumParser();
            parser.apply(element);
            return parser;
        } else {
            throw new ParserException();
        }
    }
}
