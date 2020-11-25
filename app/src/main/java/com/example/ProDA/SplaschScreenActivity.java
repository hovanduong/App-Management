package com.example.ProDA;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplaschScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splasch_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        }, 1500);
    }
}