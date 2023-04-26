package com.example.calculator.service;

import org.springframework.stereotype.Service;
@Service
public class CalcService {
      public int plus(int num1, int num2){
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
          return num1*num2;
    }
    public double divide(double num1, double num2) {
        return num1/num2;
    }
}
