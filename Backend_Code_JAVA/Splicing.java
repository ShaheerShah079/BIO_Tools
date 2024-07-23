package com.example.bio_tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class Splicing extends AppCompatActivity {
    private EditText dnaInput;
    private TextView splicingOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splicing);
        dnaInput = findViewById(R.id.editText);
        splicingOutput = findViewById(R.id.textView);
    }
public void splicing (View view) {
    String dna = dnaInput.getText().toString();
    String rna = dna.replace('T', 'U');
    int [] firstIntron = new int[20];
    int [] lastIntron =new int[20];
    int position =0;
    for(int i=0;i<rna.length()-1;i++) {
        if((rna.charAt(i)=='G')&&(rna.charAt(i+1)=='U')) {
            firstIntron[position]=i;
            for(int j=i;j<rna.length()-1;j++) {
                if(rna.charAt(j)=='G'&&rna.charAt(j+1)=='U') {
                    firstIntron[position]=j;
                }
                else if(rna.charAt(j)=='A'&&rna.charAt(j+1)=='G') {
                    lastIntron[position]=j+1;
                    position++;
                    i=j+1;
                    break;
                }}}}
    position=0;
    char[] tempExon = new char[rna.length()];
    for(int i=0;i<rna.length();i++) {
        if(firstIntron[position]<=i&&lastIntron[position]>=i) {
            if(i==lastIntron[position])
            {
                position++;
            }
        }
        else {
            tempExon[i]=rna.charAt(i);
        }}
    String exon= new String(tempExon);
    splicingOutput.setText("Splicing : \n"+exon);
}}