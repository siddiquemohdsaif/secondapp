package com.codex.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text9;
    TextView text10;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1= findViewById(R.id.text1);
        text2= findViewById(R.id.text2);
        text3= findViewById(R.id.text3);
        text4= findViewById(R.id.text4);
        text5= findViewById(R.id.text5);
        text6= findViewById(R.id.text6);
        text7= findViewById(R.id.text7);
        text8= findViewById(R.id.text8);
        text9= findViewById(R.id.text9);
        text10= findViewById(R.id.text10);

        n1= findViewById(R.id.n1);

        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int sum = Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());

                int a = Integer.parseInt(n1.getText().toString());



                    text1.setText("the sum of a & b is :"+ a*1);
                    text2.setText("the sum of a & b is :"+ a*2);
                    text3.setText("the sum of a & b is :"+ a*3);
                    text4.setText("the sum of a & b is :"+ a*4);
                    text5.setText("the sum of a & b is :"+ a*5);
                    text6.setText("the sum of a & b is :"+ a*6);
                    text7.setText("the sum of a & b is :"+ a*7);
                    text8.setText("the sum of a & b is :"+ a*8);
                    text9.setText("the sum of a & b is :"+ a*9);
                    text10.setText("the sum of a & b is :"+ a*10);




//                text.setText("the sum of a & b is :"+ sum);
            }
        });









    }
}