package com.company.android.settingsexampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goSettings(View v) {
        startActivity(new Intent(this, SettingsActivity.class));
    }

    public void goSettings2(View v) {
        startActivity(new Intent(this, SeekBarSettings.class));
    }
}
