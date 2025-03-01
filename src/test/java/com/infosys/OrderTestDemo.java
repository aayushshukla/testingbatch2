package com.infosys;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // class level annotation
public class OrderTestDemo {

  @Order(value = 3)
    @Test  // test method
    @DisplayName("Addition Test") // giving test name
    void testAddition()
    {
        System.out.println("addition running ");
        CalculatorUtil cu = new CalculatorUtil();
        int actual = cu.add(10,20);
        int expected =30;
        Assertions.assertEquals(actual,expected);

    }
@Order(value = 1)
    @Test
    @DisplayName("Multiple test")

    void testMultiple()
    {
        System.out.println("multiple 1 running ");
        CalculatorUtil cu = new CalculatorUtil();
        int actual = cu.multiple(10,2);
        int expected =20;
        Assertions.assertEquals(expected,actual);
    }

    @Order(value = 2)
    @Test
    @DisplayName("Multiple test 2")
    void testMultiple1()
    {

        System.out.println("multiple 2 running ");
        CalculatorUtil cu = new CalculatorUtil();
        int actual = cu.multiple(10,2);
        int expected =20;
        // assetionEquals(expected,actual,msg) msg will be displayed only if test case failed
        Assertions.assertEquals(expected,actual,"Difference in actual and expected values multiple test case 3 failed");
    }


}
