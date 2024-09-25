package org.example.Controller;

import org.example.Interfaces.Inota;

import javax.swing.*;

public class Main implements Inota {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Insira a nota do aluno (0 a 10):");

            try{
                double nota = Double.parseDouble(input);

            if (nota <= 10.0 && nota >= 0.0){
                if (nota >= 8.5) {
                    JOptionPane.showMessageDialog(null, EXCELENTE);
                }
                else if (nota <= 8.4 && nota >= 6.0) {
                    JOptionPane.showMessageDialog(null, SATISFATORIO);
                }
                else if (nota <= 5.9){
                    JOptionPane.showMessageDialog(null, INSUFICIENTE);
                }
            } else{
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor de 0 até 10.");
            }
        }
            catch (NumberFormatException abc) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.");
            }
    }
}
