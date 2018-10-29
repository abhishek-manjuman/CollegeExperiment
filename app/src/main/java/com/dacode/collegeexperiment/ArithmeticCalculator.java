package com.dacode.collegeexperiment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ArithmeticCalculator extends AppCompatActivity {


    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bmod,bdot,bequal,bclears;
    private TextView answer;
    private double input1,input2;
    private Boolean add=false,sub=false,mul=false,div=false,mod=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic_calculator);

        b1 = (Button) findViewById(R.id.btn_1);
        b2 = (Button) findViewById(R.id.btn_2);
        b3 = (Button) findViewById(R.id.btn_3);
        b4 = (Button) findViewById(R.id.btn_4);
        b5 = (Button) findViewById(R.id.btn_5);
        b6 = (Button) findViewById(R.id.btn_6);
        b7 = (Button) findViewById(R.id.btn_7);
        b8 = (Button) findViewById(R.id.btn_8);
        b9 = (Button) findViewById(R.id.btn_9);
        b0 = (Button) findViewById(R.id.btn_0);
        badd = (Button) findViewById(R.id.btn_sum);
        bsub = (Button) findViewById(R.id.btn_sub);
        bmul = (Button) findViewById(R.id.btn_mul);
        bdiv = (Button) findViewById(R.id.btn_div);
        bmod = (Button) findViewById(R.id.btn_mod);
        bdot = (Button) findViewById(R.id.btn_decimal);
        bequal = (Button) findViewById(R.id.btn_equal_to);
        bclears = (Button) findViewById(R.id.btn_clear);

        answer = (TextView) findViewById(R.id.cal_output);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(answer.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Double.parseDouble(answer.getText()+"");
                add = true;
                answer.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Double.parseDouble(answer.getText()+"");
                sub = true;
                answer.setText(null);            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Double.parseDouble(answer.getText()+"");
                mul = true;
                answer.setText(null);            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Double.parseDouble(answer.getText()+"");
                div = true;
                answer.setText(null);            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Double.parseDouble(answer.getText()+"");
                mod = true;
                answer.setText(null);            }
        });
        bclears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer.setText(null);
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input2 = Double.parseDouble(answer.getText()+"");
                if(add == true){
                    answer.setText(input1+" + "+input2+" = "+(input1+input2));
                    add = false;
                }
                if(sub == true){
                    answer.setText(input1+" - "+input2+" = "+(input1-input2));
                    sub = false;
                }
                if(mul == true){
                    answer.setText(input1+" * "+input2+" = "+(input1*input2));
                    mul = false;
                }
                if(add == true){
                    answer.setText(input1+" + "+input2+" = "+input1+input2);
                    add = false;
                }
                if(div == true){
                    answer.setText(input1+" / "+input2+" = "+(input1/input2));
                    div = false;
                }
                if(mod == true){
                    answer.setText(input1+" % "+input2+" = "+(input1%input2));
                    mod = false;
                }
            }
        });
    }
}
