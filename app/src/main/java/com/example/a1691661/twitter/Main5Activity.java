package com.example.a1691661.twitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rajuk.twitter.R;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    void mainClick(View view){
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
    void mainClick1(View view){
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
    void mainClick2(View view){
        Intent intent = new Intent(this, Main6Activity.class);
        startActivity(intent);
    }
}
