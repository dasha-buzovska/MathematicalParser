package com.company.parsers;

import com.company.expressions.DivisionExpression;
import com.company.expressions.IGeneralExpression;

/**
 * Created by user on 26.07.2017
 */
public class DivisionParser extends SuperParser implements GeneralParser {

    byte priority = 2;

    public byte getPriority() {
        return priority;
    }

    public void downgradePriority() {
        priority = 0;
    }

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new DivisionExpression(left, right);
    }
}
