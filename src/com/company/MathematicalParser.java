package com.company;

class MathematicalParser {

    public static void main(String[] args) throws ParserException {
        MathExpression expression = new MathExpression("4/s*2*3-4");
        double a = expression.CalculateFromList();
        System.out.println(a);
    }
}
