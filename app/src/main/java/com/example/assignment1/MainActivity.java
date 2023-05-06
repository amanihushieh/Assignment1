package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import io.github.muddz.styleabletoast.StyleableToast;


public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private ImageView img1;
    private ImageView img2;
     //this app goal to teach elementary students how to tell time using clock
    // first it gives students two examples how to use clock in sentence,then there will be 2 questions
    //first question is to read clock then select which choice is correct
    //the second one is to select which clock is correct

    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radioG);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        final MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.aud);//to put an audio when he answer correct

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//Toast will appear when click on the correct radio button
                StyleableToast.makeText(MainActivity.this, "Excellent you chose the correct time!",R.style.Toast ).show();
                mediaPlayer.start();
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StyleableToast.makeText(MainActivity.this, "Oops!,you chose the wrong time,try again",R.style.Toast2 ).show();

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radio2:
                        StyleableToast.makeText(MainActivity.this, "Excellent you chose the correct time!",R.style.Toast ).show();
                        mediaPlayer.start();
                      break;
                      case R.id.radio1:
                    case R.id.radio3:
                        StyleableToast.makeText(MainActivity.this, "Oops!,you chose the wrong time,try again",R.style.Toast2).show();
                      break;

                }
            }
        });



    }




}