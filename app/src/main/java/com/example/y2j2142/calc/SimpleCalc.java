package com.example.y2j2142.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptableObject;

public class SimpleCalc extends AppCompatActivity {
    TextView textView;
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
    Button pls;
    Button min;
    Button mul;
    Button div;
    Button pm;
    Button c;
    Button bkspc;
    Button dot;
    Button eql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);

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

        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                try{
                    ScriptableObject scope = rhino.initStandardObjects();
                    textView.setText(rhino.evaluateString(scope, textView.getText().toString(), "JavaScript", 1, null).toString());
                } finally {
                    Context.exit();
                }
            }
        });
    }
}
