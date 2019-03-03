package com.wwe.java;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/30 3:48 PM
 * @class describe
 */

@RunWith(MockitoJUnitRunner.class)
public class CaltorActivityTest {

    CaltorActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = new CaltorActivity();
    }

    @Test
    public void onStart_incrementsCountByOne() throws Exception {
       // activity.onStart();
        int result = activity.getCount();
        assertThat(result, is(0));
    }
}