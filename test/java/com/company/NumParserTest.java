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
}