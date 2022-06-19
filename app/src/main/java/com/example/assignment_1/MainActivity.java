package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1; Button button2;
        TextView count;

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        count = findViewById(R.id.counter);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Press Count", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int counter = Integer.parseInt(count.getText().toString());
                 counter++;
                 count.setText(String.valueOf(counter));


            }
        });
    }
}