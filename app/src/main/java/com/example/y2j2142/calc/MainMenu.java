package com.example.y2j2142.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainMenu extends AppCompatActivity {

    private Button buttonSimple;
    private Button buttonScientific;
    private Button buttonAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        buttonSimple = findViewById(R.id.buttonSimple);
        buttonScientific = findViewById(R.id.buttonScientific);
        buttonAbout = findViewById(R.id.buttonAbout);

        buttonSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, SimpleCalc.class);
                startActivity(intent);
            }
        });

        buttonScientific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, ScientificCalc.class);
                startActivity(intent);
            }
        });


    }
}
