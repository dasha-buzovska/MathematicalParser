package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18.07.2017.
 */
public class MathExpressionTest {
    @Test
    public void calculateFromList() throws Exception {
        MathExpression expression = new MathExpression("10-2-2");
        assertEquals(6.0, expression.CalculateFromList(), 0.0001);
    }

}