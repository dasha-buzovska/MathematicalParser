package com.company.expressions;

/**
 * Created by user on 24.07.2017
 */
public class ProductExpression implements IGeneralExpression  {

    IGeneralExpression left, right;

    public ProductExpression(IGeneralExpression left, IGeneralExpression right) {
        this.left = left;
        this.right = right;
    }

    public double getValue() {
        return left.getValue() * right.getValue();
    }
}
