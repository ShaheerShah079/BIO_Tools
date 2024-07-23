package com.example.bio_tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Translation extends AppCompatActivity {
    private EditText dnaInput;
    private TextView translationOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translation);
        dnaInput = findViewById(R.id.editText);
        translationOutput = findViewById(R.id.textView);
    }
    public void translation(View view) {
        String dna = dnaInput.getText().toString();
        StringBuilder dnaTrans = new StringBuilder(dna);
        for(int i=0 ;i<dnaTrans.length();i+=4)
        {
            dnaTrans.insert(i,' ');
        }
        String protien = neucleotideTOProtien(dnaTrans.toString());
        translationOutput.setText("Protein : \n"+protien);
    }
    public String neucleotideTOProtien(String dna) {
        String protien =dna.replace("TTT","Phe").replace("TTC","Phe").replace("TTC","Phe")
                .replace("TTA","Leu").replace("TTG","Leu").replace("CTT","Leu")
                .replace("CTC","Leu").replace("CTA","Leu").replace("CTG","Leu")
                .replace("ATT","Ile").replace("ATC","Ile").replace("ATA","Ile")
                .replace("ATG","Met").replace("GTT","Val").replace("GTC","Val")
                .replace("GTA","Val").replace("GTG","Val").replace("TCT","Ser")
                .replace("TCC","Ser").replace("TCA","Ser").replace("TCG","Ser")
                .replace("CCT","Pro").replace("CCC","Pro").replace("CCA","Pro")
                .replace("CCG","Pro").replace("ACT","Thr").replace("ACC","Thr")
                .replace("ACA","Thr").replace("ACG","Thr").replace("GCT","Ala")
                .replace("GCC","Ala").replace("GCA","Ala").replace("GCG","Ala")
                .replace("TAT","Tyr").replace("TAC","Tyr").replace("TAA","Ter")
                .replace("TAG","Ter").replace("CAT","His").replace("CAC","His")
                .replace("CAA","Gln").replace("CAG","Gln").replace("AAT","Asn")
                .replace("AAC","Asn").replace("AAA","Lys").replace("AAG","Lys")
                .replace("GAT","Asp").replace("GAC","Asp").replace("GAA","Glu")
                .replace("GAG","Glu").replace("TGT","Cys").replace("TGC","Cys")
                .replace("TGA","Ter").replace("TGG","Trp").replace("CGT","Arg")
                .replace("CGC","Arg").replace("CGA","Arg").replace("CGG","Arg")
                .replace("AGT","Ser").replace("AGC","Ser").replace("AGA","Arg")
                .replace("AGG","Arg").replace("GGT","Gly").replace("GGC","Gly")
                .replace("GGA","Gly").replace("GGG","Gly");

        return protien;
    }}