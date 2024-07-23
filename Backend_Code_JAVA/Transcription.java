package com.example.bio_tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Transcription extends AppCompatActivity {
    private EditText dnaInput;
    private TextView transcriptionOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transcription);
        dnaInput = findViewById(R.id.editText);
        transcriptionOutput = findViewById(R.id.textView2);
    }
    public void transcription(View view) {
        String dna = dnaInput.getText().toString();
        dna= dna.replace('T','U');
        transcriptionOutput.setText("Transcription:  \n"+dna);

    }}
