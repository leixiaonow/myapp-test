package com.example.myapp_test;

import android.app.Activity;
import android.os.Bundle;

public class MyActivity extends Activity {
    /**雷枭修改，在fix分支
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
