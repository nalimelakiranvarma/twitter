package com.example.a1691661.twitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


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
    void mainClick3(View view){
        Intent intent = new Intent(this, loginpage.class);
        startActivity(intent);
    }
    void mainClick4(View view){
        Intent intent = new Intent(this, me.class);
        startActivity(intent);
    }
}
