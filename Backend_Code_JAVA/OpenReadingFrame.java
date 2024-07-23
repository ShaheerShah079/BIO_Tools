package com.example.bio_tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OpenReadingFrame extends AppCompatActivity {
    private EditText dnaInput;
    private TextView frame1;
    private TextView frame2;
    private TextView frame3;
    private TextView frame4;
    private TextView frame5;
    private TextView frame6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_reading_frame);
        dnaInput = findViewById(R.id.editText);
        frame1 = findViewById(R.id.textView);
        frame2 = findViewById(R.id.textView1);
        frame3 = findViewById(R.id.textView2);
        frame4 = findViewById(R.id.textView3);
        frame5 = findViewById(R.id.textView4);
        frame6 = findViewById(R.id.textView5);
    }
    public void openreadingframe(View view)
    {
        String dna=dnaInput.getText().toString();

        StringBuilder forwardDNA1 = new StringBuilder(dna);
        for (int i = 0; i < forwardDNA1.length(); i += 4) {
            forwardDNA1.insert(i, ' ');
        }
        frame1.setText("---------------Frame " +1+"---------------\n"+forwardDNA1 +
        "\nProtein : "+neucleotideTOProtien(removeUnnecessaryNeclotide(forwardDNA1))+
        "\n"+protienToSingleWordRepresentation(neucleotideTOProtien(removeUnnecessaryNeclotide(forwardDNA1))));

        StringBuilder forwardDNA2 = new StringBuilder(dna);
        for (int i = 1; i < forwardDNA2.length(); i += 4) {
            forwardDNA2.insert(i, ' ');
        }
        frame2.setText("---------------Frame " +2+"---------------\n"+forwardDNA2+
        "\nProtein : "+neucleotideTOProtien(removeUnnecessaryNeclotide(forwardDNA2))+
        "\n"+protienToSingleWordRepresentation(neucleotideTOProtien(removeUnnecessaryNeclotide(forwardDNA2))));

        StringBuilder forwardDNA3 = new StringBuilder(dna);
        for (int i = 2; i < forwardDNA3.length(); i += 4) {
            forwardDNA3.insert(i, ' ');
        }
        frame3.setText("---------------Frame " +3+"---------------\n"+forwardDNA3+
        "\nProtein : "+neucleotideTOProtien(removeUnnecessaryNeclotide(forwardDNA3))+
        "\n"+protienToSingleWordRepresentation(neucleotideTOProtien(removeUnnecessaryNeclotide(forwardDNA3))));

        StringBuilder tempDNA = new StringBuilder(dna);
        for (int i=0 ;i<tempDNA.length();i++){
            if(tempDNA.charAt(i)=='T') {tempDNA.setCharAt(i,'A');}
            else if(tempDNA.charAt(i)=='A') {tempDNA.setCharAt(i,'T');}
            else if(tempDNA.charAt(i)=='G') {tempDNA.setCharAt(i,'C');}
            else if(tempDNA.charAt(i)=='C') {tempDNA.setCharAt(i,'G');}

        }
        tempDNA.reverse();

        StringBuilder reverseDNA = new StringBuilder(tempDNA);
        for (int i = 0; i < reverseDNA.length(); i += 4) {
            reverseDNA.insert(i, ' ');
        }
        frame4.setText("--------------Frame " +4+"---------------\n"+reverseDNA+
        "\nProtein : "+neucleotideTOProtien(removeUnnecessaryNeclotide(reverseDNA))+
        "\n"+protienToSingleWordRepresentation(neucleotideTOProtien(removeUnnecessaryNeclotide(reverseDNA))));

        StringBuilder reverseDNA1 = new StringBuilder(tempDNA);
        for (int i = 1; i < reverseDNA1.length(); i += 4) {
            reverseDNA1.insert(i, ' ');
        }
        frame5.setText("---------------Frame " +5+"---------------\n"+reverseDNA1+
        "\nProtein : "+neucleotideTOProtien(removeUnnecessaryNeclotide(reverseDNA1))+
        "\n"+protienToSingleWordRepresentation(neucleotideTOProtien(removeUnnecessaryNeclotide(reverseDNA1))));

        StringBuilder reverseDNA2 = new StringBuilder(tempDNA);
        for (int i = 2; i < reverseDNA2.length(); i += 4) {
            reverseDNA2.insert(i, ' ');
        }
        frame6.setText("---------------Frame " +6+"---------------\n"+reverseDNA2+
        "\nProtein : "+neucleotideTOProtien(removeUnnecessaryNeclotide(reverseDNA2))+
        "\n"+protienToSingleWordRepresentation(neucleotideTOProtien(removeUnnecessaryNeclotide(reverseDNA2))));
    }
    public StringBuilder removeUnnecessaryNeclotide(StringBuilder dna){
        for(int i=0;i<3;i++) {
            if(dna.charAt(i)!=' '&&dna.charAt(i+1)!=' '&&dna.charAt(i+2)!=' ') {
                break;
            }
            else if(dna.charAt(i)!=' '&&dna.charAt(i+1)!=' '){
                dna.setCharAt(i,' ');
                dna.setCharAt((i+1),' ');
            }
            else{
                dna.setCharAt(i,' ');
            }
        }
        for(int i=(dna.length()-1);i>=(dna.length()-3);i--) {
            if(dna.charAt(i)!=' '&&dna.charAt(i-1)!=' '&&dna.charAt(i-2)!=' ') {
                break;
            }
            else if(dna.charAt(i)!=' '&&dna.charAt(i-1)!=' ') {
                dna.setCharAt(i,' ');
                dna.setCharAt((i-1),' ');
            }
            else {
                dna.setCharAt(i,' '); }
        }
        return dna;
    }
    public String protienToSingleWordRepresentation(String protien) {
        String singleWordProtien= protien.replace("Phe","F").replace("Leu","L").replace("Ile","I")
                .replace("Met","M").replace("Val","V").replace("Ser","S").replace("Pro","P")
                .replace("Thr","T").replace("Ala","A").replace("Tyr","Y").replace("Ter",".")
                .replace("His","H").replace("Gln","Q").replace("Asn","N").replace("Lys","K")
                .replace("Asp","D").replace("Glu","E").replace("Cys","C").replace("Trp","W")
                .replace("Arg","R").replace("Gly","G");
        return singleWordProtien;
    }
    public String neucleotideTOProtien(StringBuilder dna) {
        String protien =dna.toString().replace("TTT","Phe").replace("TTC","Phe").replace("TTC","Phe")
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