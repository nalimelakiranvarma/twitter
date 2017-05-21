package com.example.a1691661.twitter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    void mainClick(View view){
        Intent intent = new Intent(this, twitter.class);
        startActivity(intent);
    }
    void mainClick1(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
