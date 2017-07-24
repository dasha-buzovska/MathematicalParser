package com.company.expressions;

/**
 * Created by user on 23.07.2017
 */
public class NumberExpression implements IGeneralExpression {
    private double number;

    public NumberExpression(double number) {
        this.number = number;
    }

    public double getValue() {
        return number;
    }
}
