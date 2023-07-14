package com.example.cp_caluculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class welcome_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


        Thread thread =  new Thread(){
            public void run(){
                try{
                    sleep(1500);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    if(!isTaskRoot()){
                        finish();
                    }
                    else{
                        Intent intent = new Intent(welcome_screen.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }

                }
            }
        };
        thread.start();
    }
}