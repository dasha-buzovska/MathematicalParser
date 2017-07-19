package com.company;

class NodeNumber {

    private double result = 0;

    NodeNumber(String left, String operation, String right) {
        if (operation.equals("*")) {
            result = Double.parseDouble(left) * Double.parseDouble(right);
        } else if (operation.equals("-")){
            result = Double.parseDouble(left) - Double.parseDouble(right);
        } else {
            result = Double.parseDouble(left) + Double.parseDouble(right);
        }
    }

    double getResult() {
        return result;
    }
}