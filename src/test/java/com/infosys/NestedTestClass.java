package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTestClass {

       @Nested // nested test class
       class AdditionTest
       {
           @Test
           @DisplayName("Addition Test For Positive Values")
           void testAddPositiveValues()
           {
               CalculatorUtil cu = new CalculatorUtil();
               int actual = cu.add(10,20);
               int expected = 30;
               Assertions.assertEquals(actual,expected);
           }

           @Test
           @DisplayName("Addition Test For Negative Values")
           void testAddNegativeValues()
           {
               CalculatorUtil cu = new CalculatorUtil();
               int actual = cu.add(-10,-20);
               int expected = -30;
               Assertions.assertEquals(actual,expected);
           }

       }

}
