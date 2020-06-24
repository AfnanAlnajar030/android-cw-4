package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number1 = findViewById(R.id.number1);
        final EditText number2 = findViewById(R.id.number2);
        final Button add = findViewById(R.id.addition);
        Button sub = findViewById(R.id.minus);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x = Float.parseFloat(number1.getText().toString());
                float y = Float.parseFloat(number2.getText().toString());

                float thing = x + y;
                Toast.makeText(MainActivity.this, "This is the result" + thing, Toast.LENGTH_LONG).show();

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x = Float.parseFloat(number1.getText().toString());
                float y = Float.parseFloat(number2.getText().toString());

                float thing = x - y;
                Toast.makeText(MainActivity.this, "This is the result" + thing, Toast.LENGTH_LONG).show();

            }
        });

    }
}