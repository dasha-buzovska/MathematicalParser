package com.company.expressions;

/**
 * Created by user on 23.07.2017
 */
public class PlusExpression implements IGeneralExpression {

    IGeneralExpression left, right;

    public PlusExpression(IGeneralExpression left, IGeneralExpression right) {
        this.left = left;
        this.right = right;
    }

    public double getValue() {
        return left.getValue() + right.getValue();
    }

}
