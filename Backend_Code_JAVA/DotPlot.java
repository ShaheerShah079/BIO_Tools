package com.example.bio_tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DotPlot extends AppCompatActivity {
    private EditText dnaInput1;
    private EditText dnaInput2;
    private TextView dotPlotGraph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dot_plot);
        dnaInput1 = findViewById(R.id.editText);
        dnaInput2 = findViewById(R.id.editText2);
        dotPlotGraph = findViewById(R.id.textView);
    }

    public void dotPlot(View view) {
        String dna1 = dnaInput1.getText().toString();
        String dna2 = dnaInput2.getText().toString();
        String txt ="   ";
        for (int i = 0; i < dna1.length(); i++) {
            txt = txt+"  "+Character.toString(dna1.charAt(i));
        }
        for (int i = 0; i < dna2.length(); i++) {
            txt=txt+"\n"+Character.toString(dna2.charAt(i)) + "  ";
            for (int j = 0; j < dna1.length(); j++) {
                if (dna2.charAt(i) == dna1.charAt(j)) {
                    txt = txt + "  .  ";
                } else {
                    txt = txt + "    ";
                }
            }

        }
        dotPlotGraph.setText(txt);

    }
}