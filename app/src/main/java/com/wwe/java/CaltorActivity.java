package com.wwe.java;

import android.app.Activity;
import android.os.Bundle;

public class CaltorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private int mCount;

    @Override
    protected void onStart() {
        super.onStart();
        mCount++;
    }

    public int getCount() {
        return mCount;
    }
}

