package com.wwe.java;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/30 3:58 PM
 * @class describe
 */

@RunWith(MockitoJUnitRunner.class)
public class PositiveNumberValidatorTest {

    PositiveNumberValidator pv;

    @Before
    public void setUp() throws Exception {
        pv = new PositiveNumberValidator();
    }

    @Test
    public void test1() {
        boolean result = pv.isPositive(-1);
        Assert.assertThat(result, CoreMatchers.is(false));
    }

    @Test
    public void test2() {
        boolean result = pv.isPositive(0);
        Assert.assertThat(result, CoreMatchers.is(false));
    }

    @Test
    public void test3() {
        boolean result = pv.isPositive(1);
        Assert.assertThat(result, CoreMatchers.is(true));
    }
}