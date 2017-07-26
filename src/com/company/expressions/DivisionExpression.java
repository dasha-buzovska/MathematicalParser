package com.company.expressions;

/**
 * Created by user on 26.07.2017
 */
public class DivisionExpression implements IGeneralExpression {

    IGeneralExpression left, right;

    public DivisionExpression(IGeneralExpression left, IGeneralExpression right) {
        this.left = left;
        this.right = right;
    }

    public double getValue() {
        return left.getValue() / right.getValue();
    }
}
