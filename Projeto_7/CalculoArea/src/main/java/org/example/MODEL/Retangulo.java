package org.example.MODEL;

public class Retangulo extends Calculo{

    public Retangulo(double base, double altura) {
        super(base, altura);

    }

    public double calculaArea() {
        return getBase() * getAltura();
    }


}
