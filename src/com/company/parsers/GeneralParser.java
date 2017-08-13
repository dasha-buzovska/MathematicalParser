package com.company.parsers;

import com.company.ParserException;
import com.company.expressions.IGeneralExpression;

public interface GeneralParser {

    boolean isEnd(char element);
    void apply(char element);
    IGeneralExpression getExpression();
    GeneralParser startNewParser(char element) throws ParserException;
    byte getPriority();
    void createExpression(IGeneralExpression left, IGeneralExpression right);
    void downgradePriority();
}