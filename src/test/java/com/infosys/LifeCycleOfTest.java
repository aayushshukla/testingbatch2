package com.infosys;

import org.junit.jupiter.api.*;

public class LifeCycleOfTest {


    CalculatorUtil cu;
    @BeforeAll  // for before all method should be static
    // because BeforeAll will be executed even before instance of the class is created
  static  void beforeAllInit()
    {
        System.out.println("Before all is running ...");
    }

    @BeforeEach // will be execute before every test
    void init()
    {
        System.out.println("--Running before every test----");
        cu = new CalculatorUtil();
    }

    @Test  // test method
    @DisplayName("Addition Test") // giving test name
    void testAddition()
    {
        System.out.println("Add test running .....");
        CalculatorUtil cu = new CalculatorUtil();
        int actual = cu.add(10,20);
        int expected =30;
        Assertions.assertEquals(actual,expected);

    }

    @Test
    @DisplayName("Multiple test")

    void testMultiple()
    {
        System.out.println("Multiple test running .....");

        int actual = cu.multiple(10,2);
        int expected =20;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Multiple test 2")
    void testMultiple1()
    {
        System.out.println("Multiple 2 test running .....");

        int actual = cu.multiple(10,2);
        int expected =20;
        // assetionEquals(expected,actual,msg) msg will be displayed only if test case failed
        Assertions.assertEquals(expected,actual,"Difference in actual and expected values multiple test case 3 failed");
    }

    @AfterEach
    void cleanUpCode()
    {
        System.out.println("Cleaning code removing object ");
    }
   @AfterAll
   static void afterAllTestFinished()
    {
        System.out.println("After all test execution  is done. This code will execute ");
    }

}
