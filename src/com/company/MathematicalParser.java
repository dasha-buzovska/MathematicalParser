package com.company;

class MathematicalParser {

    public static void main(String[] args) {
        try {
            MathExpression expression = new MathExpression("4/2*2*3-4");
            double a = expression.CalculateFromList();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.out.println("Please, check your expression and use only number and maths operation");
        }
    }
}
