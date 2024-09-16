package org.example;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        aluno alunos = new aluno();

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Olá, seja bem vindo ao nosso sistema de cadastro!");
        System.out.println("-------------------------------------------------------------");

        System.out.print("\nDigite o seu nome: ");
            alunos.nome = sc.next();
        System.out.print("Digite o seu endereço residencial: ");
            alunos.endereco = sc.next();
        System.out.print("Digite o seu telefone de contato: ");
            alunos.telefone = sc.next();
        System.out.print("Digite o seu endereço de e-mail: ");
            alunos.email = sc.next();
        System.out.print("Digite o seu número de matrícula: ");
            alunos.matricula = sc.next();

        System.out.println("\n-------------------------------------------------------------");
        System.out.println(alunos.getAllInfo());
        System.out.println("-------------------------------------------------------------");

    }
}
