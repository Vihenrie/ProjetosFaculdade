package org.example.Model;

import org.example.Interface.Icalcular;

public class Divisao implements Icalcular {
    @Override
    public double calcular(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }
}
