package com.company.parsers;

import com.company.expressions.DivisionExpression;
import com.company.expressions.IGeneralExpression;

/**
 * Created by user on 26.07.2017
 */
public class DivisionParser extends SuperParser {

    DivisionParser() {
        priority = 2;
    }

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new DivisionExpression(left, right);
    }

}
