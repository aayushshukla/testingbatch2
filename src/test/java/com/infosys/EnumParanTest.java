package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumParanTest {

    @ParameterizedTest
    @EnumSource(Days.class)
    void  checkEnumValues(Days dayValue)
    {
        Assertions.assertEquals("sun",dayValue.toString(),"Day not match with sun");
    }
}
