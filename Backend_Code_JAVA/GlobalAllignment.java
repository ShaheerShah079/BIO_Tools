package com.example.bio_tools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GlobalAllignment extends AppCompatActivity {

    private EditText dnaInput1;
    private EditText dnaInput2;
    private EditText match;
    private EditText misMatch;
    private EditText gap;
    private TextView gloabalAllignmentGraph;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_global_allignment);
        dnaInput1 = findViewById(R.id.editText);
        dnaInput2 = findViewById(R.id.editText2);
        match= findViewById(R.id.editText3);
        misMatch = findViewById(R.id.editText4);
        gap = findViewById(R.id.editText5);
        gloabalAllignmentGraph = findViewById(R.id.textView);

    }

    public void globalAllignment(View view)
    {
        String temp1 =dnaInput1.getText().toString();
        String temp2= dnaInput2.getText().toString();
        int match_=Integer.parseInt(match.getText().toString());
        int misMatch_=Integer.parseInt(misMatch.getText().toString());
        int gap_=Integer.parseInt(gap.getText().toString());

        StringBuilder s1 = new StringBuilder(temp1);
        StringBuilder s2 = new StringBuilder(temp2);
        s1.insert(0, ' ');
        s2.insert(0,' ');
        int [][] matrix = new int [s2.length()][s1.length()];
        int horizontal,vertical,daignol,max;

        for(int i=1 ;i<s1.length();i++)
        {
            matrix[0][i]=i*-1;
        }
        for(int i=1 ;i<s2.length();i++)
        {
            matrix[i][0]=i*-1;
        }

        for(int i=1;i<s2.length();i++)
        {
            for(int j=1;j<s1.length();j++)
            {
                horizontal = matrix[i][j-1]+gap_;
                vertical = matrix[i-1][j]+gap_;
                if(s1.charAt(j)==s2.charAt(i)) daignol=matrix[i-1][j-1]+match_;
                else         daignol=matrix[i-1][j-1]+misMatch_;

                max = horizontal;
                if(vertical>max)  max = vertical;
                if(daignol>max)   max = daignol;

                matrix[i][j]=max;
            }
        }
        String txt ="\n";
        for(int i=0;i<s1.length();i++)
        {
            txt = txt+"  "+Character.toString(s1.charAt(i));
        }

        for(int i=0;i<s2.length();i++)
        {
            txt = txt+"\n"+Character.toString(s2.charAt(i))+"  ";

            for(int j=0;j<s1.length();j++)
            {
                if(matrix[i][j]>=0&&matrix[i][j]<=9)txt = txt+" "+Integer.toString(matrix[i][j])+" ";
                else txt = txt+Integer.toString(matrix[i][j])+" ";
            }

        }
        gloabalAllignmentGraph.setText(txt);



    }


}