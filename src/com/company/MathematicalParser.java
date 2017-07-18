package com.company;

class MathematicalParser {

    public static void main(String[] args) {
        MathExpression expression = new MathExpression("-2+10-50+1");
        expression.printList();
        expression.CalculateFromList();
    }
}
