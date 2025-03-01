package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamtestingDemo {

    CalculatorUtil cu;
    User user;

    @BeforeEach
    void init()
    {
        cu = new CalculatorUtil();
        user = new User();

    }

    @ParameterizedTest
    @ValueSource(ints={10,15,21,32,58,71})
    void isEvenTest(int x)
    {
        Assertions.assertTrue(cu.checkEvenNo(x));
    }

    @ParameterizedTest
    @NullSource // supply null value to the source code
    void checkNull(String value)
    {
        Assertions.assertEquals(user.getName(),value);
    }

    @ParameterizedTest
    @EmptySource// supply empyy value to the source code
    void checkEmpty(String value)
    {
        user.setName("");
        Assertions.assertEquals(user.getName(),value);
    }

    @ParameterizedTest
    @NullAndEmptySource //  it will pass null value first and than empty value
    void checkNullAndEmpty(String value)
    {
        Assertions.assertTrue(value==user.getName() || value.isEmpty());
    }




}
