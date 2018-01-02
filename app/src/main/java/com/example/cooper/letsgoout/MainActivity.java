package com.example.cooper.letsgoout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    String currentTime;
    EditText time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get current time and put into variable
        currentTime = Calendar.getInstance().getTime().toString();

        time = findViewById(R.id.currentTime);
        time.setText(currentTime);
    }
}
