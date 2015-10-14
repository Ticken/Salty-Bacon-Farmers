package com.example.tim.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // vars
    // buttons
    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button bX;
    Button bDivide;
    Button bSum;
    Button bQuo;
    Button bDec;
    Button bEqu;
    Button bCE;
    Button bAns;
    Button bDelete;
    // text and strings
    TextView tv;
    String sTemp="", sNum1, sNum2;
    // nums
    double dNum1, dNum2, dAns;
    int nFun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // setting the buttons
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b0=(Button) findViewById(R.id.button0);
        bX=(Button) findViewById(R.id.button15);
        bDivide=(Button) findViewById(R.id.button14);
        bSum=(Button) findViewById(R.id.button12);
        bQuo=(Button) findViewById(R.id.button13);
        bDec=(Button) findViewById(R.id.button10);
        bEqu =(Button) findViewById(R.id.button11);
        bCE = (Button) findViewById(R.id.button16);
        bAns = (Button) findViewById(R.id.button17);
        bDelete = (Button) findViewById(R.id.button18);



        // setting the text view
        tv = (TextView) findViewById(R.id.textView);
        // BUTTONS!!!!!!!!!!!!! ALL THE BUSDZFHUJDSHFJKDFUGDS
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+"1";
                tv.setText(sTemp);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+"2";
                tv.setText(sTemp);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+"3";
                tv.setText(sTemp);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+"4";
                tv.setText(sTemp);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+"5";
                tv.setText(sTemp);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+"6";
                tv.setText(sTemp);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+"7";
                tv.setText(sTemp);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+"8";
                tv.setText(sTemp);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+"9";
                tv.setText(sTemp);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+"0";
                tv.setText(sTemp);
            }
        });
        // non number buttons
        bDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp=sTemp+".";
                tv.setText(sTemp);
            }
        });
        bX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum1 = sTemp;
                sTemp ="";
                tv.setText(sTemp);
                nFun=1;
            }
        });
        bDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum1 = sTemp;
                sTemp ="";
                tv.setText(sTemp);
                nFun=2;
            }
        });
        bSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum1 = sTemp;
                sTemp ="";
                tv.setText(sTemp);
                nFun=3;
            }
        });
        bQuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum1 = sTemp;
                sTemp ="";
                tv.setText(sTemp);
                nFun =4;
            }
        });
        bCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp ="";
                nFun =0;
                tv.setText(sTemp);
            }
        });
        bAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp =Double.toString(dAns);
                tv.setText(sTemp);
            }
        });
        bDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sTemp = sTemp.substring(0, sTemp.length() - 1);
                ;
                tv.setText(sTemp);
            }
        });
        bEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sNum2 = sTemp;
                sTemp ="";
                dNum1 = Double.parseDouble(sNum1);
                dNum2 = Double.parseDouble(sNum2);
                if (nFun==1){
                    dAns = dNum1*dNum2;
                    sTemp = Double.toString(dAns);
                }
                if (nFun==2){
                    dAns = dNum1/dNum2;
                    sTemp = Double.toString(dAns);
                }
                if (nFun==3){
                    dAns = dNum1+dNum2;
                    sTemp = Double.toString(dAns);
                }
                if (nFun==4){
                    dAns = dNum1-dNum2;
                    sTemp = Double.toString(dAns);
                }

                tv.setText(sTemp);
            }
        });

    }
}
