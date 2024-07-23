package com.example.bio_tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Percentageofgccontent extends AppCompatActivity {
    private EditText dnaInput;
    private TextView perOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentageofgccontent);
        dnaInput = findViewById(R.id.editText);
        perOutput = findViewById(R.id.textView);
    }
public void percentageofgccontent(View view) {
    String dna = dnaInput.getText().toString();
    int c=0,g=0;
    for(int i=0;i<dna.length();i++) {
        if(dna.charAt(i)=='C') {
            c++;
        }
        else if(dna.charAt(i)=='G') {
            g++;
        }
    }
    int gcContent = g+c;
    perOutput.setText("Percentage of C in the sequence is "
            +String.format ("%.2f",(c/(float)dna.length()*100))
            +"%"+"\n"+"Percentage of G in the sequence is "
            +String.format ("%.2f",(g/(float)dna.length()*100))
            +"%"+"\n"+"Percentage of GC content in the sequence is "
            +String.format ("%.2f",(gcContent/(float)dna.length()*100))+"%");
}
}