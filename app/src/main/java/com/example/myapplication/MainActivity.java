package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.myapplication.Evaluator;


public class MainActivity extends AppCompatActivity {
    private String inputLine = "";
    private Evaluator evaluator = new Evaluator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //input display
        TextView display = findViewById(R.id.inputDisplay);

        //create a onclick listener for the button
        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "1";
                display.setText(inputLine);
                System.out.println("Button 1 clicked");
            }
        });

        //create a onclick listener for the button2
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "2";
                display.setText(inputLine);
                System.out.println("Button 2 clicked");
            }
        });

        //create a onclick listener for the button3
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "3";
                display.setText(inputLine);
                System.out.println("Button 3 clicked");
            }
        });

        //create a onclick listener for the button4
        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "4";
                display.setText(inputLine);
                System.out.println("Button 4 clicked");
            }
        });

        //create a onclick listener for the button5
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "5";
                display.setText(inputLine);
                System.out.println("Button 5 clicked");
            }
        });

        //create a onclick listener for the button6
        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "6";
                display.setText(inputLine);
                System.out.println("Button 6 clicked");
            }
        });

        //create a onclick listener for the button7
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "7";
                display.setText(inputLine);
                System.out.println("Button 7 clicked");
            }
        });

        //create a onclick listener for the button8
        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "8";
                display.setText(inputLine);
                System.out.println("Button 8 clicked");
            }
        });

        //create a onclick listener for the button9
        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "9";
                display.setText(inputLine);
                System.out.println("Button 9 clicked");
            }
        });

        //create a onclick listener for the buttonZero
        Button buttonZero = findViewById(R.id.buttonZero);
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += "0";
                display.setText(inputLine);
                System.out.println("Button 0 clicked");
            }
        });

        //create onclick listener for the plusButton
        Button plusButton = findViewById(R.id.plusButton);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += " + ";
                display.setText(inputLine);
                System.out.println("Button + clicked");
            }
        });

        //create onclick listener for the subButton
        Button subButton = findViewById(R.id.subButton);
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += " - ";
                display.setText(inputLine);
                System.out.println("Button - clicked");
            }
        });

        //create a new onclick listener for the multiButton
        Button multiButton = findViewById(R.id.multiButton);
        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += " x ";
                display.setText(inputLine);
                System.out.println("Button * clicked");
            }
        });

        //create a new onclick listener for the newButton
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button divButton = findViewById(R.id.newButton);
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine += " / ";
                display.setText(inputLine);
                System.out.println("Button / clicked");
            }
        });

        //create a new onclick listener for the dltButton
        Button dltButton = findViewById(R.id.dltButton);
        dltButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine = inputLine.substring(0, inputLine.length() - 1);
                display.setText(inputLine);
                System.out.println("Button dlt clicked");
            }
        });

        //create a new onclick listener for the clrButton
        Button clrButton = findViewById(R.id.clrButton);
        clrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the second activity
                inputLine = "";
                display.setText(inputLine);
                System.out.println("Button clr clicked");
            }
        });

        //create a new onclick listener for the equalButton
        Button equalButton = findViewById(R.id.equalButton);
        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                double result = cal.evaluate(inputLine);
//                display.setText(String.valueOf(result));

                double result = evaluator.evaluate(inputLine);
                if(result == -1234465567890.0){
                    display.setText("Syntax Error");
                }else{
                display.setText(String.valueOf(result));
                inputLine = "";
                }


            }
        });

        // this function to handle the touch events occur in other areas except the buttons.
        ConstraintLayout parentLayout = findViewById(R.id.parent_layout);
        parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // handle the touch event
                System.out.println("Parent layout clicked");
            }
        });






    }
}