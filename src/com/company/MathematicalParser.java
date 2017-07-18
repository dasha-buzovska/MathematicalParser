package com.company;

class MathematicalParser {

    public static void main(String[] args) {
        MathExpression expression = new MathExpression("10-2-2");
        expression.CalculateFromList();
    }
}
