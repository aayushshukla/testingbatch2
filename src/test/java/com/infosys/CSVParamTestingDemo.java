package com.infosys;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Test Report and info along with csv param test cases demo")
public class CSVParamTestingDemo {

    TestReporter testReporter;
    TestInfo testInfo;

    CalculatorUtil cu;

    @BeforeEach
    void init(TestReporter testReporter,TestInfo testInfo)
    {
        this.testReporter = testReporter; // it is an interface
        this.testInfo = testInfo;  // it is an interface
        cu = new CalculatorUtil();
        testReporter.publishEntry("Test class running \t"+testInfo.getTestClass() +"\n test running \t "+
                testInfo.getTestMethod()
        +"\n tags \t "+testInfo.getTags()
        +"\n test name \t"+testInfo.getDisplayName());
    }

    @ParameterizedTest
    @DisplayName("CSV Param Test On Add ")
    @CsvSource({"10,0","10,10","15,5","20,0"})
    void addTest(int a,int b)
    {
       int actual =  cu.add(a,b);
       int expected = 20;
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"5 ! 3","10 ! 2","4 ! 5","20 ! 1"},delimiterString = "!")
void multipleTest(int a,int b)
    {
        int actual =  cu.multiple(a,b);
        int expected = 20;
        Assertions.assertEquals(expected,actual);
    }

   @ParameterizedTest
   @DisplayName("CSV Param Test From CSV File ")
   @CsvFileSource(files = "src/test/resources/TestingParam.csv",
   numLinesToSkip = 1)
    void multipleTest(int a,int b,int c)
    {
        int actual =  cu.multiple(a,b,c);
        int expected = 40;
        Assertions.assertEquals(expected,actual);
    }


    @Test
    @DisplayName("Multiple test 2")
    @Tag("Multiple")
    void testMultiple1()
    {
        CalculatorUtil cu = new CalculatorUtil();
        int actual = cu.multiple(10,2);
        int expected =30;
        // assetionEquals(expected,actual,msg) msg will be displayed only if test case failed
        Assertions.assertEquals(expected,actual,"Difference in actual and expected values multiple test case 3 failed");
    }


}
