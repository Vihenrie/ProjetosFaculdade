package org.example.Model;

import org.example.Interface.Icalcular;

public class Multiplicacao implements Icalcular {
    @Override
    public double calcular(double num1, double num2) {
        return num1 * num2;
    }
}