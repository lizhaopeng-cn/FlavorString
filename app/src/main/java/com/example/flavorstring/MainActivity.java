package com.example.flavorstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;

import com.example.corelibrary.CoreMain;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Log.i("MyTag", CoreMain.variants);
//                Log.i("MyTag",getApplication().getString(R.string.projectID));
                setTime();
            }
        });
    }

    private void setTime() {
        Log.i("MyTag","18-5");
//
//        Timer timer = new Timer();
//        TimerTask timerTask = new TimerTask() {
//            @Override
//            public void run() {
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        send();
//                    }
//                });
//            }
//        };
//        timer.schedule(timerTask, 5 * 1000);


    }

    private void send(){
        int a = 0;
        CountDownTimer timer = new CountDownTimer(18 * 1000, 5000) {
            public void onTick(long millisUntilFinished) {
                Log.i("MyTag",millisUntilFinished / 1000 + "s");
            }

            public void onFinish() {
                Log.i("MyTag",18 % 5 + "finish");
            }
        };
        timer.start();
    }
}