package com.vmk.solutions.nazgul.miprimerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ethello = findViewById(R.id.ethello);
        Button bthello = findViewById(R.id.bthello);

        bthello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hello = ethello.getText().toString();

                if (hello.isEmpty()){
                    return;
                }

                Intent intent = new Intent(MainActivity.this, HelloActivity.class);
                intent.putExtra("msgHello", hello);
                startActivity(intent);

            }
        });
    }
}
