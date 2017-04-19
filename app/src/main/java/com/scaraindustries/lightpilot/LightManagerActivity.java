package com.scaraindustries.lightpilot;

import android.os.Bundle;
import android.app.Activity;

public class LightManagerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_manager);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
