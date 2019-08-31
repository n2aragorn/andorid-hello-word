package com.vmk.solutions.nazgul.miprimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        String msg = getIntent().getStringExtra("msgHello");

        TextView tvHello = findViewById(R.id.tvhello);

        tvHello.setText(msg);
    }
}
