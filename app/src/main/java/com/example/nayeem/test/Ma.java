package com.example.nayeem.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Ma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ma);
    }

    public void sendBack(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void sendHome(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void sendBefore(View view) {
        Intent intent = new Intent(this,Before.class);
        startActivity(intent);
    }

    public void sendAfter(View view) {
        Intent intent = new Intent(this,After.class);
        startActivity(intent);
    }

    public void sendEmergency(View view) {
        Intent intent = new Intent(this,Emergency.class);
        startActivity(intent);
    }

}
