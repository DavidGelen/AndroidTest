package com.wwe.java.example2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @name AndroidTest
 * @class name：com.wwe.java.example2
 * @class describe
 * @anthor David
 * @time 2019/1/30 5:07 PM
 * @class describe
 */
public class UserInputValidatorTest {
    UserInputValidator uv;

    @Before
    public void setUp() throws Exception {
        uv = new UserInputValidator();
    }

    @Test
    public void test1() {
        Boolean result = uv.isValidFullName("");
        assertThat(result,is(false));
    }

    @Test
    public void test2() {
        Boolean result = uv.isValidFullName("zhangbiao");
        assertThat(result,is(true));
    }

    @Test(expected = RuntimeException.class)
    public void test3() {
        Boolean result = uv.isValidUsername("");
        assertThat(result,is(false));
    }
}