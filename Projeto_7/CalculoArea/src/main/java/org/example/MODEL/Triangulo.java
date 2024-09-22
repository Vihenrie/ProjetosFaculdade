package org.example.MODEL;

public class Triangulo extends Calculo{
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public double calculaArea() {
        return (getBase() * getAltura()) / 2;
    }
}
