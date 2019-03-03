package com.wwe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * @name AndroidTest
 * @class name：com.wwe
 * @class describe
 * @anthor David
 * @time 2019/1/30 6:22 PM
 * @class describe
 */
public class UtilTest {

    @Test
    public void test1()  throws Exception {
        Context context = mock(Context.class);
        Intent intent = Util.createQuery(context, "query", "value");
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        assertNotNull(extras);
        assertEquals("query", extras.getString("QUERY"));
        assertEquals("value", extras.getString("VALUE"));
    }

}