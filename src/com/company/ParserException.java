package com.company;

/**
 * Created by user on 11.08.2017
 */
public class ParserException extends Exception {
    public ParserException() {
        super("You type here not a number or right maths operation(+, -, /, *), try again");
    }
}
