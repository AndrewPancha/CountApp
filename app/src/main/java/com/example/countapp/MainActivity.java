package com.example.countapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCounter;
    private Button buttonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCounter = findViewById(R.id.counter);
        buttonZero = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        buttonZero.setBackgroundColor(Color.GREEN);
        mCount++;
        if (mShowCounter != null)
            mShowCounter.setText(mCount);
    }

    public void setToZero(View view) {
        if (mCount != 0) {
            mCount = 0;
            mShowCounter.setText(mCount);
            buttonZero.setBackgroundColor(Color.GRAY);
        }
    }
}