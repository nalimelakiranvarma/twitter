package com.example.a1691661.twitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void mainClick(View view){
        Intent intent = new Intent(this, twitter.class);
        startActivity(intent);
    }
    void mainClick1(View view){
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }
    void mainClick2(View view){
        Intent intent = new Intent(this, Main5Activity.class);
        startActivity(intent);
    }
    void mainClick3(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    void mainClick4(View view){
        Intent intent = new Intent(this, me.class);
        startActivity(intent);
    }
}
