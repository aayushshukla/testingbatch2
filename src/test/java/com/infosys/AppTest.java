package com.infosys;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 *
 * By default for each test case there will different instances
 * if I have n test cases than n instances of test class will created
 * all instances creation will be take care by Junit
 * all test  cases run parallely
 */
public class AppTest 
{

     @Test  // test method
     @DisplayName("Addition Test") // giving test name
      void testAddition()
      {
          CalculatorUtil cu = new CalculatorUtil();
          int actual = cu.add(10,20);
          int expected =30;
          Assertions.assertEquals(actual,expected);

      }

      @Test
      @DisplayName("Multiple test")

      void testMultiple()
      {
          CalculatorUtil cu = new CalculatorUtil();
          int actual = cu.multiple(10,2);
          int expected =20;
          Assertions.assertEquals(expected,actual);
      }

    @Test
    @DisplayName("Multiple test 2")
    void testMultiple1()
    {
        CalculatorUtil cu = new CalculatorUtil();
        int actual = cu.multiple(10,2);
        int expected =20;
        // assetionEquals(expected,actual,msg) msg will be displayed only if test case failed
        Assertions.assertEquals(expected,actual,"Difference in actual and expected values multiple test case 3 failed");
    }





      @Test
      @Disabled  // this test case will be ignored.It is not executed
      void show()
       {
          String msg ="Hello show";
          Assertions.assertEquals(msg,"Hello show");
       }

}
