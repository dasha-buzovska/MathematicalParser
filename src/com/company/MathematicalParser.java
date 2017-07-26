package com.company;

class MathematicalParser {

    public static void main(String[] args) {
        MathExpression expression = new MathExpression("2/2*2*3/4");
        double a = expression.CalculateFromList();
        System.out.println(a);
    }
}
