package com.infosys;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;


// a test suite is a collection of test cases that  are grouped together to test a software application.
@Suite
@SuiteDisplayName("My test suite")
@SelectClasses({RepeatTestCaseDemo.class, AssetionsDemoTest.class, AppTest.class})
public class MyTestSuite {
}
