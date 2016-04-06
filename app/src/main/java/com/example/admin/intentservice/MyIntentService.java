package com.example.admin.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

public class MyIntentService extends IntentService {
    private String TAG = "TAG_";
    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("TAG", "onHandleIntent: Hola" + Thread.currentThread());
        int x = 0;
        while(true){
            x++;
            if(x <= 20)
                Log.d(TAG, "onHandleIntent: " + x);
        }

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: " + Thread.currentThread());

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        int x = 0;
        super.onCreate();
        Log.d(TAG, "onCreate: " + Thread.currentThread());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + Thread.currentThread());
    }
}
