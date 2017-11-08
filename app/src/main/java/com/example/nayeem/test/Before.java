package com.example.nayeem.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Before extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.before);
    }

    public void sendBack(View view) {
        Intent intent = new Intent(this,Ma.class);
        startActivity(intent);
    }

    public void sendHome(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void sendmaFood(View view) {
        Intent intent = new Intent(this,Mafood2Activity.class);
        startActivity(intent);
    }

    public void sendTika(View view) {
        Intent intent = new Intent(this,Tika.class);
        startActivity(intent);
    }


}
