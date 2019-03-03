package com.wwe;

import android.content.Context;
import android.content.Intent;

/**
 * @name AndroidTest
 * @class name：com.wwe
 * @class describe
 * @anthor David
 * @time 2019/1/30 6:21 PM
 * @class describe
 */
public class Util {

    public static Intent createQuery(Context context, String query, String value) {
        Intent i = new Intent(context, MainActivity.class);
        i.putExtra("QUERY", query);
        i.putExtra("VALUE", value);
        return i;
    }
}
