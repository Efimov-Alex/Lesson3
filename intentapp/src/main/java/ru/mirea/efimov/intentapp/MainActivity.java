package ru.mirea.efimov.intentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));

      //  Intent intent = new Intent(MainActivity.this, SecondActivity.class);
    //    intent.putExtra("key", dateString);
    //    startActivity(intent);

    }

    public void onClick(View v){
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "КВАДРАТ МОЕГО ЗНАЧЕНИЯ ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ 16," + "а текущее время "
                  + dateString);
        startActivity(intent);
    }
}