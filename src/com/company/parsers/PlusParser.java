package com.company.parsers;

import com.company.expressions.IGeneralExpression;
import com.company.expressions.PlusExpression;

/**
 * Created by user on 24.07.2017
 */
public class PlusParser extends SuperParser implements GeneralParser {

    byte priority = 1;

    public byte getPriority() {
        return priority;
    }

    public void downgradePriority() {
        priority = 0;
    }

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new PlusExpression(left, right);
    }
}
