package com.jzd.learn;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    static Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHandler.postDelayed((Runnable) () -> skipLogin(), 2000L);
    }

    private void skipLogin() {
        Intent intent = new Intent(SplashActivity.this,
                FlutterEnterActivity.class);
        startActivity(intent);
        finish();
    }

}