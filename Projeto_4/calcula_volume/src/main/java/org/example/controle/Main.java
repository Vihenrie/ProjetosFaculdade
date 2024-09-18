package org.example.controle;

import javax.swing.JOptionPane;
import org.example.MODEL.Calculo;

public class Main {
    public static void main(String[] args) {

        String baseInput = JOptionPane.showInputDialog("Informe o tamanho da base (em metros): ");
            double base = Double.parseDouble(baseInput);
        String alturaInput = JOptionPane.showInputDialog("Informe o tamanho da altura (em metros): ");
            double altura = Double.parseDouble(alturaInput);
        String comprimentoInput = JOptionPane.showInputDialog("Informe o tamanho do comprimento (em metros): ");
            double comprimento = Double.parseDouble(comprimentoInput);

        Calculo c1 = new Calculo(base, altura, comprimento);
        double total = c1.calculoVolume();

        System.out.println("\n============================================================================");
        System.out.println("O Valor total do volume será de: " + total + " metros!");
        System.out.println("============================================================================");

    }
}