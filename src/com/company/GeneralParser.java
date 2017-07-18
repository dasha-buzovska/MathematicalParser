package com.company;

public interface GeneralParser {

    boolean isEnd(char element);
    void apply(char element);
    String getElement();
    GeneralParser startNewParser(char element);

}