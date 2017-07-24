package com.company;

import com.company.expressions.IGeneralExpression;

public interface GeneralParser {

    boolean isEnd(char element);
    void apply(char element);
    IGeneralExpression getExpression();
    GeneralParser startNewParser(char element);

}