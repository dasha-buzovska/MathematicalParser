package com.company.parsers;

import com.company.expressions.*;

/**
 * Created by user on 24.07.2017
 */
public class ProductParser extends SuperParser implements GeneralParser {

    byte priority = 2;

    public byte getPriority() {
        return priority;
    }

    public void downgradePriority() {
        priority = 0;
    }

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new ProductExpression(left, right);
    }
}
