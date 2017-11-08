package com.example.nayeem.test;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;

/**
 * Created by Imu on 02-Apr-16.
 */
public class Splasht extends Activity{
    @Override
    protected void onCreate(Bundle FirstThread) {
        super.onCreate(FirstThread);
        setContentView(R.layout.splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openMainActivity = new Intent("com.example.nayeem.test.MAINACTIVITY");
                    startActivity(openMainActivity);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}