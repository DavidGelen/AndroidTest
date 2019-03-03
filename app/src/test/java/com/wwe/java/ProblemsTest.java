package com.wwe.java;

import android.text.TextUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/30 3:28 PM
 * @class describe
 */
@RunWith(MockitoJUnitRunner.class)
public class ProblemsTest {

    Problems problems;

    @Before
    public void setUp() throws Exception {
        problems = new Problems();
    }

    @Test
    public void callStaticAndroidApi() {
        problems.callStaticAndroidApi("");

        // Assert
        assertThat(true, is(true));
    }

}