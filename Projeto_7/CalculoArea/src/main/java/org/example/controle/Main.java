package org.example.controle;

import org.example.MODEL.Retangulo;
import org.example.MODEL.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;

        System.out.println("==================================================================================================");
        System.out.println("Ola, seja bem-vindo a sua mega calculadora de area de retangulo e triangulo retangulo!");
        System.out.println("==================================================================================================");
        System.out.println("\nAntes de tudo precisamos saber qual forma você quer calcular a area");
        System.out.println("Digite 1 para calcularmos a area de um RETANGULO");
        System.out.println("Digite 2 para calcularmos a area de um TRIANGULO RETANGULO");
        System.out.print("\nDigite aqui: ");
            option = sc.nextInt();

            //RETANGULO
        if(option == 1){
            System.out.println("\nVAMOS CALCULAR UM RETANGULO!");
            System.out.print("\nAgora nos informe o valor da base: ");
                double base = sc.nextInt();
            System.out.print("Informe o valor da altura: ");
                double altura = sc.nextInt();

            Retangulo r1 = new Retangulo(base, altura);

            System.out.println("A area do Retangulo será de: "+ r1.calculaArea());
        }
        //TRIANGULO RETANGULO
        else if (option == 2){
            System.out.println("\nVAMOS CALCULAR UM TRIANGULO RETANGULO!");
            System.out.print("\nAgora nos informe o valor da base: ");
            double base = sc.nextInt();
            System.out.print("Informe o valor da altura: ");
            double altura = sc.nextInt();

            Triangulo t1 = new Triangulo(base, altura);

            System.out.println("A area do Retangulo será de: "+ t1.calculaArea());
        }
        else {
            System.out.println("Opção invalida!");
        }

    }
}