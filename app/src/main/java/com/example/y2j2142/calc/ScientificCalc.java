package com.example.y2j2142.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.ScriptableObject;

public class ScientificCalc extends AppCompatActivity {

    TextView textView;
    Button b0, b1, b2, b3,b4,b5,b6,b7,b8,b9,pls,min,mul,div,pm,c,bkspc,dot,eql, bsin,bcos,btan, bln,bpow,blog,openb,closeb, bsqrt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scientific_calc);

        textView = findViewById(R.id.textView);
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        pls = findViewById(R.id.pls);
        min = findViewById(R.id.min);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        pm = findViewById(R.id.pm);
        c = findViewById(R.id.C);
        bkspc = findViewById(R.id.bkspc);
        dot = findViewById(R.id.dot);
        eql = findViewById(R.id.eql);
        bsin = findViewById(R.id.sin);
        bcos = findViewById(R.id.cos);
        btan = findViewById(R.id.tan);
        bln = findViewById(R.id.ln);
        bpow = findViewById(R.id.pow);
        blog = findViewById(R.id.log);
        openb = findViewById(R.id.openb);
        closeb = findViewById(R.id.closeb);
        bsqrt = findViewById(R.id.sqrt);




        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("9");
            }
        });

        pm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().equals(""))
                    textView.setText("-");
                else {
                    if (textView.getText().toString().substring(0,1).equals("-")) {
                        Log.d("test", textView.getText().toString());
                        textView.setText("+" + textView.getText().toString().substring(1));
                    }
                    else if (textView.getText().toString().substring(0,1).equals("+"))
                        textView.setText("-" + textView.getText().toString().substring(1));
                    else
                        textView.setText('-' + textView.getText().toString());
                }
            }
        });

        pls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("+");
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("-");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("/");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("*");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append(".");
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });
        bkspc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().toString().length() > 0)
                    textView.setText(textView.getText().toString().substring(0, textView.getText().toString().length() - 1));
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("sin(");
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("cos(");
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("ln(");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("log(");
            }
        });

        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("pow(");
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("tan(");
            }
        });

        openb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("(");
            }
        });

        closeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append(")");}
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("\u221a(");
            }
        });







        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String temp = textView.getText().toString();
                temp = temp.replaceAll("\u221a", "Math.sqrt");
                temp = temp.replaceAll("log", "Math.log");
                temp = temp.replaceAll("ln", "Math.Id_log10");
                temp = temp.replaceAll("pow", "Math.exp");
                temp = temp.replaceAll("sin", "Math.sin");
                temp = temp.replaceAll("cos", "Math.cos");
                temp = temp.replaceAll("tan", "Math.tan");
                temp = temp.replaceAll("Math.Math.", "Math.");

                Log.d("test", temp);
                try{
                    ScriptableObject scope = rhino.initStandardObjects();
                    temp = rhino.evaluateString(scope, temp, "JavaScript", 1, null).toString();
                    if(temp.matches("(.*)Undefined(.*)") || temp.matches("(.*)NaN(.*)"))
                        temp = "Invalid input";
                    textView.setText(temp);
                }catch (EvaluatorException e){textView.setText("Invalid input");}

                finally {
                    Context.exit();
                }
            }
        });
    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("textView", textView.getText().toString());
        super.onSaveInstanceState(savedInstanceState);
    }


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getString("textView"));
    }





    }
