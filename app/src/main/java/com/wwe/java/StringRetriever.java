package com.wwe.java;

import android.content.Context;

/**
 * @name AndroidTest
 * @class name：com.wwe.java
 * @class describe
 * @anthor David
 * @time 2019/1/29 5:34 PM
 * @class describe
 */
public class StringRetriever {

    private final Context mContext;

    public StringRetriever(Context context) {
        mContext = context;
    }

    public String getString(int id) {
        return mContext.getString(id);
    }
}
