package com.scaraindustries.lightpilot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToLightManagerActivity(View view){
        Intent intent = new Intent(this,LightManagerActivity.class);
        startActivity(intent);
    }

    public void goToDeviceManagerActivity(View view){
        //Intent intent = new Intent(this,DeviceManagerActivity.class);
        //startActivity(intent);
    }

    public void goToSettingsActivity(View view){
        Intent intent = new Intent(this,SettingsActivity.class);
        startActivity(intent);
    }

    public void goToAboutActivity(View view){
       // Intent intent = new Intent(this,AboutActivity.class);
       // startActivity(intent);
    }
}
