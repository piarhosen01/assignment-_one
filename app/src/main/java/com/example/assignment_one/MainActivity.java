package com.example.assignment_one;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private TextView counterText;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = findViewById(R.id.counterText);
        FloatingActionButton resetButton = findViewById(R.id.resetButton);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetCounter();
            }
        });
    }

    public void incrementCounter(View view) {
        count++;
        counterText.setText(String.valueOf(count));
    }

    public void resetCounter() {
        count = 0;
        counterText.setText(String.valueOf(count));
        Toast.makeText(this, "The counter has been reset to zero.", Toast.LENGTH_SHORT).show();
    }
}
