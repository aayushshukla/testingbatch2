package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatTestCaseDemo {

    @RepeatedTest(5)
    void myRepeatTest(RepetitionInfo repetitionInfo)
    {
        System.out.println("Total repetition"+repetitionInfo.getTotalRepetitions());
        User u = new User();
        u.setName("Goku");
        String actual =u.getName();
        String expected ="Goku";
        Assertions.assertEquals(actual,expected,"Name dont match");
        System.out.println("No of repetition"+repetitionInfo.getCurrentRepetition());
    }
}
