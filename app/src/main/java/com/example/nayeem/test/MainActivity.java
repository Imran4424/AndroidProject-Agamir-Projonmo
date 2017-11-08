package com.example.nayeem.test;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMa(View view) {
        Intent intent = new Intent(this,Ma.class);
        startActivity(intent);
    }

    public void sendBaby(View view) {
        Intent intent = new Intent(this,BabyActivity.class);
        startActivity(intent);
    }

}
