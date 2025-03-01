package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssetionsDemoTest {

    @Test
    void  divTest()
    {
        CalculatorUtil cu = new CalculatorUtil();
        int actual = cu.div(10,2);
        int expected =5;
        Assertions.assertEquals(actual,expected);

    }

    @Test
    void  divExceptionTest()
    {
        CalculatorUtil cu = new CalculatorUtil();
        // test case become true only if exception : Arithmetic Exception is throw from method
        Assertions.assertThrows(ArithmeticException.class,()->cu.div(10,0),"divide by zero");

    }

    @Test
    void  divNoExceptionTest()
    {
        CalculatorUtil cu = new CalculatorUtil();

        Assertions.assertDoesNotThrow(()->cu.div(10,2),"exception in code");

    }

    @Test
    @DisplayName("Testing for null values")
    void testNullUserName()
    {
          User u = new User();
          Assertions.assertNull(u.getName());
    }

    @Test
    @DisplayName("Testing for not null values")
    void testNotNullUserName()
    {
        User u = new User();
        u.setName("Solo leveling");
        Assertions.assertNotNull(u.getName());
    }

    //assertAll()  it become true if all the combines test cases pass
    @Test
    void testDivision()
    {
        CalculatorUtil cu = new CalculatorUtil();
        // assertAll is similar to And operator
        Assertions.assertAll(
                // test 1
                ()->Assertions.assertEquals(2,cu.div(10,5)),
                ()-> Assertions.assertEquals(1,cu.div(10,10)),
                ()->Assertions.assertDoesNotThrow(()->cu.div(10,2),"exception in code")

        );
    }

    @Test
    void testSameObject()
    {
        String s1 ="Hi";
        String s2 = "Hi";
        String s3 = new String("Hi");
        Assertions.assertSame(s1,s2);
        //Assertions.assertSame(s1,s3);
    }

    @Test
    void compareTest()
    {
        int x =10;
        int y =20;
        Assertions.assertTrue(y>x);
    }

    @Test
    void compareTest1()
    {
        int x =10;
        int y =20;
        Assertions.assertFalse(x>y);
    }





}
