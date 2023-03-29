package ru.mirea.efimov.intentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String value = (String) getIntent().getSerializableExtra("key");

        textView = findViewById(R.id.textView);
        textView.setText(value);
    }
}