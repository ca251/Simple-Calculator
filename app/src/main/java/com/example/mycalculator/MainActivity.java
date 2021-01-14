package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Double.NaN;
import static java.lang.Double.doubleToLongBits;

public class MainActivity extends AppCompatActivity {
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnadd;
    private Button btnsub;
    private Button btnmul;
    private Button btndiv;
    private Button btnequ;
    private Button clear;
    private Button btnsin;
    private Button btncos;
    private Button btntan;
    private Button btnLog;
    private Button btnSinInv;
    private Button btnCosInv;
    private Button btnTanInv;
    private Button btnfactorial;
    private Button btnexp;
    private Button btnPow;
    private Button Log10;
    private Button In;
    private Button btnbin;
    private Button btndec;
    private Button pow10;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char EQU = 0;
    private double val1 = NaN;
    private double val2;
    private char ACTION;
    boolean mSin;
    boolean mCos;
    boolean mTan;
    boolean mlog;
    boolean sinInv;
    boolean cosInv;
    boolean tanInv;
    boolean xbtn;
    boolean ex;
    boolean pow;
    boolean lg;
    boolean inn;
    String numString;
    int number;
    //double decNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);
            }
        });

        btnequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                info.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info.getText().length() > 0) {
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });
        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double s =Math.sin(Float.parseFloat(info.getText().toString()));
                    info.setText(" ");
                    result.setText(info.getText().toString()+ s);
                }
                catch (Exception e){

                }
                info.setText("sin");
                mSin=true;


            }
        });
        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double c = Math.cos(Double.parseDouble(info.getText().toString()));
                    info.setText(" ");
                    result.setText(info.getText().toString() + c);
                }
                catch (Exception e){

                }
                info.setText("cos");
                mCos=true;
            }
        });
        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double t = Math.tan(Double.parseDouble(info.getText().toString()));
                    info.setText(" ");
                    result.setText(info.getText().toString() + t);
                } catch (Exception e) {

                }
                info.setText("tan");
                mTan = true;

            }

        });
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double l = Math.log(Double.parseDouble(info.getText().toString()));
                    info.setText(" ");
                    result.setText(info.getText().toString() + l);
                }catch (Exception e){

                }
                info.setText("log");
                mlog = true;
            }

        });
        btnSinInv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double r = Math.sinh(Double.parseDouble(info.getText().toString()));
                    info.setText(" ");
                    result.setText(info.getText().toString()+ r);
                }catch (Exception e){

                }
                info.setText("sin-1");
                sinInv = true;
            }
        });
        btnCosInv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double c = Math.cosh(Double.parseDouble(info.getText().toString()));
                    info.setText(" ");
                    result.setText(info.getText().toString()+ c);
                }catch (Exception e){

                }
                info.setText("cos-1");
                cosInv = true;
            }
        });
        btnTanInv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double t = Math.tanh(Double.parseDouble(info.getText().toString()));
                    info.setText(" ");
                    result.setText(info.getText().toString()+ t);
                }catch (Exception e){

                }
                info.setText("tan-1");
                tanInv = true;
            }
        });
        btnfactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double a = 1 / Double.parseDouble(info.getText().toString());
                    info.setText("");
                    result.setText(info.getText().toString()+a);
                }catch (Exception e){

                }
                info.setText("1/x");
                xbtn = true;
            }
        });
        btnexp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double e = Math.exp(Double.parseDouble(info.getText().toString()));
                    info.setText("");
                    result.setText(info.getText().toString());
                }catch (Exception e){

                }
                info.setText("exp");
                ex = true;
            }
        });
        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double p = Math.pow(Double.parseDouble(info.getText().toString()), 2);
                    info.setText(" ");
                    result.setText(info.getText().toString()+ p+"");
                }catch (Exception e){

                }
                info.setText("pow");
                pow = true;
            }
        });
        Log10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double t = Math.log10(Double.parseDouble(info.getText().toString()));
                    info.setText(info.getText().toString()+ t);
                }catch (Exception e){

                }
                info.setText("log10");
                lg = true;
            }
        });
        In.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double i = Double.parseDouble(info.getText().toString());
                    double answer = (-Math.log(1- i))/i;
                    result.setText(info.getText().toString() + answer);
                }catch (Exception e){

                }
                info.setText("In");
                inn = true;
            }
        });
        btnbin.setOnClickListener(new View.OnClickListener() {
            double bn;
            @Override
            public void onClick(View v) {
                try {
                    numString = info.getText().toString();
                    number = Integer.parseInt(numString);
                    numString = Integer.toBinaryString(number);
                    info.setText(numString);

                }catch (Exception e){

                }
            }
        });
        btndec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    numString = info.getText().toString();
                    number = Integer.parseInt(numString, 2);
                    numString = Integer.toString(number);
                    info.setText(numString);

                }catch (Exception e){

                }
            }
        });
        pow10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int p = Integer.parseInt(info.getText().toString());
                    int exp = (int) Math.pow(10, p);
                    result.setText(exp+"");
                }catch (Exception e){

                }
            }
        });



    }

    private void setupUIViews() {

        btn1 = (Button) findViewById(R.id.btn1);
        btn0 = (Button) findViewById(R.id.btn0);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndivide);
        btnequ = (Button) findViewById(R.id.btnequal);
        info = (TextView) findViewById(R.id.Control);
        result = (TextView) findViewById(R.id.Result);
        clear = (Button) findViewById(R.id.btnclear);
        btnsin = (Button) findViewById(R.id.btnsin);
        btncos = (Button) findViewById(R.id.btncos);
        btntan = (Button) findViewById(R.id.btntan);
        btnLog = (Button) findViewById(R.id.btnLog);
        btnSinInv = (Button) findViewById(R.id.btnSinInv);
        btnCosInv = (Button) findViewById(R.id.btnCosIv);
        btnTanInv = (Button) findViewById(R.id.btnTanInv);
        btnfactorial = (Button) findViewById(R.id.btnfractorial);
        btnexp = (Button) findViewById(R.id.btnexp);
        btnPow = (Button) findViewById(R.id.btnPow);
        Log10 = (Button) findViewById(R.id.Log10);
        In = (Button) findViewById(R.id.In);
        btnbin = (Button) findViewById(R.id.btnbin);
        btndec = (Button) findViewById(R.id.btndec);
        pow10 = (Button) findViewById(R.id.pow10);
    }

    private void compute() {
        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(info.getText().toString());

           /* if (ACTION == ADDITION) {
                val1 = val1 + val2;
            } else if (ACTION == SUBTRACTION) {
                val1 = val1 - val2;
            } else if (ACTION == MULTIPLICATION) {
                val1 = val1 * val2;
            } else if (ACTION == DIVISION) {
                val1 = val1 / val2;
            }*/

            switch (ACTION) {
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case SUBTRACTION:
                    val1 = val1 - val2;
                    break;
                case MULTIPLICATION:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQU:
                    break;
            }
        }
        else {
            val1 = Double.parseDouble(info.getText().toString());
        }
    }

}

