package com.wwe.java;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/30 4:07 PM
 * @class describe
 */
@RunWith(MockitoJUnitRunner.class)
public class StringReverserTest {

    StringReverser sr;

    @Before
    public void setUp() throws Exception {
        sr = new StringReverser();
    }

    @Test
    public void test1() throws Exception {
        String result = sr.reverse("");
        assertThat(result, is(""));
    }

    @Test
    public void test2() throws Exception {
        String result = sr.reverse("a");
        assertThat(result, is("a"));
    }

    @Test
    public void test3() throws Exception {
        String result = sr.reverse("Vasiliy Zukanov");
        assertThat(result, is("vonakuZ yilisaV"));
    }
}