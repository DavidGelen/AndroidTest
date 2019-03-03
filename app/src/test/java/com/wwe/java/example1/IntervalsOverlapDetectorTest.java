package com.wwe.java.example1;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @name AndroidTest
 * @class name：com.wwe.java.example1
 * @class describe
 * @anthor David
 * @time 2019/1/30 4:19 PM
 * @class describe
 */
public class IntervalsOverlapDetectorTest {

    IntervalsOverlapDetector iod;

    @Before
    public void setUp() throws Exception {
        iod = new IntervalsOverlapDetector();
    }

    @Test
    public void test1() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(8, 12);
        boolean result = iod.isOverlap(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void test2() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(3, 12);
        boolean result = iod.isOverlap(interval1, interval2);
        assertThat(result, is(true));
    }

    @Test
    public void test3() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-4, 12);
        boolean result = iod.isOverlap(interval1, interval2);
        assertThat(result, is(true));
    }

    @Test
    public void test4() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(0, 3);
        boolean result = iod.isOverlap(interval1, interval2);
        assertThat(result, is(true));
    }

    @Test
    public void test5() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-4, 4);
        boolean result = iod.isOverlap(interval1, interval2);
        assertThat(result, is(true));
    }

    @Test
    public void test6() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-10, -3);
        boolean result = iod.isOverlap(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void test7() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(5, 8);
        boolean result = iod.isOverlap(interval1, interval2);
        assertThat(result, is(false));
    }

    @Test
    public void test8() throws Exception {
        Interval interval1 = new Interval(-1, 5);
        Interval interval2 = new Interval(-3, -1);
        boolean result = iod.isOverlap(interval1, interval2);
        assertThat(result, is(false));
    }
}