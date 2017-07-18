package com.company;

import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18.07.2017.
 */
public class OperationParserTest {
    @Test
    public void isEnd() throws Exception {
        OperationParser parser = new OperationParser();
        assertEquals(false, parser.isEnd('+'));

    }

    @Test
    public void startNewParser() throws Exception {
        OperationParser parser = new OperationParser();
        NumParser parser1 = new NumParser();
        Objects.deepEquals(parser1, parser.startNewParser('0'));

    }

}