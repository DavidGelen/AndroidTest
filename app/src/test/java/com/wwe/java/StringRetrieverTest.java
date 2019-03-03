package com.wwe.java;

import android.content.Context;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/30 11:13 AM
 * @class describe
 */
@RunWith(MockitoJUnitRunner.class)
public class StringRetrieverTest {

    public static final int ID = 10;
    public static final String STRING = "string";

    StringRetriever sr;

    @Mock
    Context mContextMock;

    @Before
    public void setUp() throws Exception {
        sr = new StringRetriever(mContextMock);
    }

    @Test
    public void getString_correctResultReturned() throws Exception {
        // Arrange
        when(mContextMock.getString(ID)).thenReturn(STRING);

        // Act
        String result = sr.getString(ID);

        // Assert
        assertThat(result, is(STRING));
    }

    @Test
    public void getString_correctParameterPassedToContext() throws Exception {
        // Act
        sr.getString(ID);

        // Assert
        verify(mContextMock,times(1)).getString(ID);
    }
}