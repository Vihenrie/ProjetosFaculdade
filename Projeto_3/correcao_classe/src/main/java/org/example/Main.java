package org.example;

public class Main {
    public static void main(String[] args) {
        int previsaoDemanda = 200;
        int producaoNormal = 250;
        int estoqueInicial = 50;
        int estoqueFinal;

        estoqueFinal = (estoqueInicial + producaoNormal) - previsaoDemanda;

        System.out.println("O estoque final previsto para o mês é de: " + estoqueFinal +" Unidades");
    }
}