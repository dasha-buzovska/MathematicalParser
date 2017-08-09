package com.company.parsers;

import com.company.expressions.IGeneralExpression;
import com.company.expressions.PlusExpression;

/**
 * Created by user on 24.07.2017
 */
public class PlusParser extends SuperParser {

    PlusParser() {
        priority = 1;
    }

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new PlusExpression(left, right);
    }

}
