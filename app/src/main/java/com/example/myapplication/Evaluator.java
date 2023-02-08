package com.example.myapplication;


import java.util.ArrayList;
import java.util.Arrays;

public class Evaluator {
    public double evaluate(String expression){
        //split the expression into tokens
        try {
            String[] tokens = expression.split(" ");
            double result = Double.parseDouble(tokens[0]);
            for (int i = 1; i < tokens.length; i += 2) {
                switch (tokens[i]) {
                    case "+":
                        result += Double.parseDouble(tokens[i + 1]);
                        break;
                    case "-":
                        result -= Double.parseDouble(tokens[i + 1]);
                        break;
                    case "x":
                        result *= Double.parseDouble(tokens[i + 1]);
                        break;
                    case "/":
                        result /= Double.parseDouble(tokens[i + 1]);
                        break;
                }
            }
            return result;
        }catch (Exception e){
            return -1234465567890.0;
        }


    }
}
