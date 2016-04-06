package com.example.admin.intentservice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.am_tv_1);
    }

    public void addCount(View v){
        Intent intent = new Intent(this, MyIntentService.class);
        startService(intent);
    }

    public void runService(View v){
        Intent intent = new Intent(this, MyIntentService.class);
        startService(intent);
    }

}
