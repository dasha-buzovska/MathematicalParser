package com.company.parsers;

import com.company.expressions.*;

/**
 * Created by user on 24.07.2017
 */
public class ProductParser extends SuperParser {

    ProductParser() {
        priority = 2;
    }

    public void createExpression(IGeneralExpression left, IGeneralExpression right) {
        expression = new ProductExpression(left, right);
    }
}
