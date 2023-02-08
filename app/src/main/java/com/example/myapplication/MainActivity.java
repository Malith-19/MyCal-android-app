package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String inputLine = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //create a onclick listener for the button
        Button button = findViewById(R.id.button1);
        TextView display = findViewById(R.id.inputDisplay);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "1";
                display.setText(inputLine);
                System.out.println("Button 1 clicked");
            }
        });
    }
}