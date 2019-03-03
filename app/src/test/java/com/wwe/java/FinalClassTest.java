package com.wwe.java;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/30 6:12 PM
 * @class describe
 */
public class FinalClassTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1() {
        FinalClass instance = new FinalClass();
        FinalClass mock = mock(FinalClass.class);
        when(mock.finalMethod()).thenReturn("that other thing");
        assertNotEquals(mock.finalMethod(), instance.finalMethod());
    }
}