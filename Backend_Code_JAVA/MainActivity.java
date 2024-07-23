package com.example.bio_tools;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void transcription(View view) throws ClassNotFoundException {
        Toast.makeText(this,"Opening Transcription",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Transcription.class);
        startActivity(intent);
    }
    public void translation(View view) throws ClassNotFoundException {
        Toast.makeText(this,"Opening Translation",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Translation.class);
        startActivity(intent);
    }
    public void palidrome(View view) throws ClassNotFoundException {
        Toast.makeText(this,"Opening Plaidrome",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Plaidrome.class);
        startActivity(intent);
    }
    public void openreadingframe(View view) throws ClassNotFoundException {
        Toast.makeText(this,"Opening Open Reading Frame",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,OpenReadingFrame.class);
        startActivity(intent);
    }
    public void percenatgeofgccontent(View view) throws ClassNotFoundException {
        Toast.makeText(this,"Opening Percentage of DNA",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Percentageofgccontent.class);
        startActivity(intent);
    }
    public void splicing(View view) throws ClassNotFoundException {
        Toast.makeText(this,"Opening Splicing",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,Splicing.class);
        startActivity(intent);
    }
    public void globalAllignment(View view) throws ClassNotFoundException {
        Toast.makeText(this,"Opening GLOBAL ALLIGNMENT",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,GlobalAllignment.class);
        startActivity(intent);
    }
    public void localAllignment(View view) throws ClassNotFoundException {
        Toast.makeText(this,"Opening LOCAL ALLIGNMENT",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,LocalAllignment.class);
        startActivity(intent);
    }
    public void dotPlot(View view) throws ClassNotFoundException {
        Toast.makeText(this,"Opening DOT PLOT MATRIX",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,DotPlot.class);
        startActivity(intent);
    }

}