package com.example.animeekrangiris;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private ImageView imageView;
    private Animation animasyon;
    private Animation yukardanAsagi;
    private Animation sagdan;
    private Animation soldan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);

       /* animasyon = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.momo);
        button.setAnimation(animasyon);

        yukardanAsagi = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.yukardan_asagiya);
        imageView.setAnimation(yukardanAsagi);
        textView.setAnimation(yukardanAsagi); */

        soldan = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.soldan);
        imageView.setAnimation(soldan);
        textView.setAnimation(soldan);

        sagdan = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sagdan);
        button.setAnimation(sagdan);


    }
}