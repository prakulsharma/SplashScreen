package com.example.venice;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method is used so that your splash activity
        //can cover the entire screen.

        setContentView(R.layout.activity_splash);
        //this will bind your MainActivity.class file with activity_main.

        /*
         * Animation
         */
        ImageView outerCircle = findViewById(R.id.imageView4);
        ImageView innerCircle = findViewById(R.id.imageView5);
        ImageView bolt = findViewById(R.id.imageView);


        outerCircle.animate().scaleX(0.9f).setDuration(2000);
        outerCircle.animate().scaleY(0.9f).setDuration(2000);
        innerCircle.animate().scaleX(0.8f).setDuration(2000);
        innerCircle.animate().scaleY(0.8f).setDuration(2000);
        bolt.animate().translationYBy(150f).setDuration(2000);



        int SPLASH_SCREEN_TIME_OUT = 3000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Splash.this,
                        MainActivity.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
                //invoke the SecondActivity.

                finish();
                //the current activity will get finished.
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}