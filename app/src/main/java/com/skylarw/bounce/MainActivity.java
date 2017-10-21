package com.skylarw.bounce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Variables
    private Button rngBut, bounBut;
    private ImageView iconL, iconR;

    //Intent
    private Intent rngI,bounI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startR();
        startL();

        rngBut = (Button) findViewById(R.id.buttonStart2);
        rngBut.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                rngI=new Intent(MainActivity.this, BallRng.class);
                startActivity(rngI);
            }
        });
    }

    private void startL()
    {
        iconL = (ImageView) findViewById(R.id.iconStart2);
        final Animation animation = new TranslateAnimation(-400, 0, 0, 0);
        animation.setDuration(2000);
        animation.setInterpolator(new AccelerateInterpolator(1.0f));
        animation.setRepeatCount(-1);
        iconL.startAnimation(animation);
    }

    private void startR()
    {
        iconR = (ImageView) findViewById(R.id.iconStart1);
        final Animation animation = new TranslateAnimation(400, 0, 0, 0);
        animation.setDuration(2000);
        animation.setInterpolator(new AccelerateInterpolator(1.0f));
        animation.setRepeatCount(-1);
        iconR.startAnimation(animation);
    }


}