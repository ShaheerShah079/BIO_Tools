package com.example.bio_tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Plaidrome extends AppCompatActivity {
    private EditText dnaInput;
    private TextView palindromeOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plaidrome);
        dnaInput = findViewById(R.id.editText);
        palindromeOutput = findViewById(R.id.textView);
    }
    public void palidrome(View view) {
        String dna = dnaInput.getText().toString();
        // make a sting temp of size 50 to store palindrome in it
        String temp[]= new String[50];
        // intialize a num var with 0 that index to temp
        int num=0;
        for(int i=0;i<dna.length();i++) {
            for(int j=dna.length();j>i+2;j--) {
                StringBuilder s1 = new StringBuilder(dna.substring(i,j));
                StringBuilder s2 = new StringBuilder(s1);
                s2.reverse();
                if(s1.toString().equals(s2.toString())) {
                    temp[num]=s1.toString();
                    num++;
                    i=j-1;
                    break;
                }
            }
        }
        // make another string of size num to store temp to palindrome
        String[] palidrome=new String[num];
        for(int i=0;i<palidrome.length;i++) {
            palidrome[i]=temp[i];
        }
        palindromeOutput.setText("Palindromes :\n"+ Arrays.toString(palidrome));
    }}