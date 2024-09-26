package org.example.Controller;

import org.example.Model.Adicao;
import org.example.Model.Divisao;
import org.example.Model.Multiplicacao;
import org.example.Model.Subtracao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###,###,##0.00");

        int option;

        System.out.println("\nSeja bem vindo a sua mega calculadora!");
        System.out.println("Porem ela tem uma limitação, calcula apenas valores com no maximo 2 digitos");
        System.out.println("Para seguirmos precisaremos saber qual tipo de operação você deseja realizar");

        System.out.println("\nDigite 1 para fazer uma ADIÇÃO!");
        System.out.println("Digite 2 para fazer uma SUBTRAÇÃO!");
        System.out.println("Digite 3 para fazer uma MULTIPLICAÇÃO!");
        System.out.println("Digite 4 para fazer uma DIVISÃO!");
        
        System.out.print("\nDigite aqui a opção escolhida: ");
            option = sc.nextInt();
                sc.nextLine();

        if (option == 1) {
            System.out.println("\nA opção escolhida foi ADIÇÃO!");

            System.out.print("\nInforme o valor do primeiro numero: ");
                double num1 = sc.nextDouble();
                    sc.nextLine();
            System.out.print("Informe o valor do segundo numero: ");
                double num2 = sc.nextDouble();
                    sc.nextLine();

                    if(num1 <= 99.99 && num2 >= 0){
                        Adicao a1 = new Adicao();

                        double resultado = a1.calcular(num1, num2);
                        System.out.println("\nO resultado da ADIÇÃO é: " + df.format(resultado));

                        sc.close();
                    }
                    else {
                        System.out.println("\nOs valores informados não são compativeis com a nossa calculadora, tente novamente!");

                        sc.close();
                    }

        } else if (option == 2){
            System.out.println("\nA opção escolhida foi SUBTRAÇÃO!");

            System.out.print("\nInforme o valor do primeiro numero: ");
                double num1 = sc.nextDouble();
                    sc.nextLine();
            System.out.print("Informe o valor do segundo numero: ");
                double num2 = sc.nextDouble();
                    sc.nextLine();

            if(num1 <= 99.99 && num2 >= 0){
                Subtracao s1 = new Subtracao();

                double resultado = s1.calcular(num1, num2);
                System.out.println("\nO resultado da SUBTRAÇÃO é: " + df.format(resultado));

                sc.close();
            }
            else {
                System.out.println("\nOs valores informados não são compativeis com a nossa calculadora, tente novamente!");

                sc.close();
            }

        } else if (option == 3){
            System.out.println("\nA opção escolhida foi MULTIPLICAÇÃO!");

            System.out.print("\nInforme o valor do primeiro numero: ");
                double num1 = sc.nextDouble();
                    sc.nextLine();
            System.out.print("Informe o valor do segundo numero: ");
                double num2 = sc.nextDouble();
                    sc.nextLine();

            if(num1 <= 99.99 && num2 >= 0){
                Multiplicacao m1 = new Multiplicacao();

                double resultado = m1.calcular(num1, num2);
                System.out.println("\nO resultado da MULTIPLICAÇÃO é: " + df.format(resultado));

                sc.close();
            }
            else {
                System.out.println("\nOs valores informados não são compativeis com a nossa calculadora, tente novamente!");

                sc.close();
            }

        } else if (option == 4){
            System.out.println("\nA opção escolhida foi DIVISÂO!");

            System.out.print("\nInforme o valor do primeiro numero: ");
                double num1 = sc.nextDouble();
                    sc.nextLine();
            System.out.print("Informe o valor do segundo numero: ");
                double num2 = sc.nextDouble();
                    sc.nextLine();

            if(num1 <= 99.99 && num2 >= 0){
                Divisao s1 = new Divisao();

                double resultado = s1.calcular(num1, num2);
                System.out.println("\nO resultado da DIVISÂO é: " + df.format(resultado));

                sc.close();
            }
            else {
                System.out.println("\nOs valores informados não são compativeis com a nossa calculadora, tente novamente!");

                sc.close();
            }

        } else {
            System.out.println("Opção invalida!");

            sc.close();
        }

    }
}