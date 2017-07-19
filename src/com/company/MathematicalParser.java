package com.company;

class MathematicalParser {

    public static void main(String[] args) {
        MathExpression expression = new MathExpression("2*2+10-3");
        expression.CalculateFromList();
    }
}
