package com.example.cloudy;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();
        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(1500);

                }catch (Exception e){
                    e.printStackTrace();

                }finally {
                    Intent intent = new Intent(splashscreen.this,MainActivity.class);
                    startActivity(intent);

                }
            }
        };thread.start();

    }
}
