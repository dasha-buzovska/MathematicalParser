package com.company;

import com.company.parsers.NumParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18.07.2017.
 */
public class NumParserTest {
    @Test
    public void isEnd() throws Exception {
        NumParser parser = new NumParser();
        assertEquals(false, parser.isEnd('9'));
    }

    @Test
    public void startNewParser() throws Exception {
        //OperationParser parser = new OperationParser();
        //NumParser parser1 = new NumParser();
        //Objects.deepEquals(parser, parser1.startNewParser('+'));
    }

}