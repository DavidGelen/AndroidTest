package com.wwe.java;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/29 5:11 PM
 * @class describe
 */
public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        int sum = calculator.add(1,1);
        assertEquals(2,sum);
    }

    @Test
    public void multiply() {
        int product = calculator.multiply(2, 4);
        assertEquals(8, product);
    }

    //在Junit中，可以通过给@Test annotation传入一个expected参数来达到这个目
    @Test(expected = IllegalArgumentException.class)
    public void divide() {
        calculator.divide(4, 0);
    }

    //我们可能想让JUnit忽略某些方法，让它在跑所有测试方法的时候不要跑这个测试方法。
    // 要达到这个目的也很简单，只需要在要被忽略的测试方法前面加上@Ignore就可以了
    /*@Test
    @Ignore("not implemented yet")
    public void testFactorial() {
    }*/
}