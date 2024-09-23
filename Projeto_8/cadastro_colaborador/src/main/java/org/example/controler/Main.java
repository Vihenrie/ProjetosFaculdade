package org.example.controler;

import org.example.MODEL.Fisica;
import org.example.MODEL.Juridica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;

        System.out.println("\n======================================================================================");
        System.out.println("Seja muito bem-vindo ao sistema de cadastro de colaboradores de nossa instituição");
        System.out.println("Para conseguirmos prosseguir precisamos saber que tipo de colaborador você é");
        System.out.println("\nDigite - 1 - para colaborador do estilo pessoa FISICA");
        System.out.println("Digite - 2 - para colaborador do estilo pessoa JURIDICA");
        System.out.print("\nDigite aqui: ");
            option = sc.nextInt();
                sc.nextLine();

            //FISICA
        if(option == 1){
            System.out.println("\nA opção selecionada foi para o cadastro de pessoa FISICA, para prosseguirmos precisaremos saber algumas informações");

            System.out.print("\nInforme o seu nome: ");
                String nome = sc.nextLine();
            System.out.print("Informe a sua idade: ");
                int idade = sc.nextInt();
                    sc.nextLine();
            System.out.print("Informe o seu logradouro: ");
                String logradouro = sc.nextLine();
            System.out.print("Informe o numero da sua casa: ");
                int numeroCasa = sc.nextInt();
                    sc.nextLine();
            System.out.print("Informe o seu bairro: ");
                String bairro = sc.nextLine();
            System.out.print("Informe a sua cidade: ");
                String cidade = sc.nextLine();
            System.out.print("Informe a sua unidade federativa: ");
                String UF = sc.nextLine();
            System.out.print("Informe o seu telefone: ");
                String telefone = sc.nextLine();
            System.out.print("Informe o seu email: ");
                String email = sc.nextLine();
            System.out.print("Informe o seu CPF: ");
                String CPF = sc.nextLine();
            System.out.print("Informe o seu RG: ");
                String RG = sc.nextLine();
            System.out.print("Informe o sua titulo: ");
                String titulacao = sc.nextLine();
            System.out.print("Informe as suas disciplinas: ");
                String disciplinas = sc.nextLine();

            Fisica f1 = new Fisica(nome, logradouro, numeroCasa, bairro, cidade, UF, telefone, email, disciplinas, CPF, RG, idade, titulacao);

            f1.cadastro();
        }
        //JURIDICA
        else if(option == 2){
            System.out.println("\nA opção selecionada foi para o cadastro de pessoa JURIDICA, para prosseguirmos precisaremos saber algumas informações");

            System.out.print("\nInforme a sua razão social: ");
                String razaoSocial = sc.nextLine();
            System.out.print("Informe o seu numero de inscrição estadual: ");
                int inscricaoEstadual = sc.nextInt();
                    sc.nextLine();
            System.out.print("Informe o seu nome: ");
                String nome = sc.nextLine();
            System.out.print("Informe o seu logradouro: ");
                String logradouro = sc.nextLine();
            System.out.print("Informe o numero da sua empresa: ");
                int numeroCasa = sc.nextInt();
                    sc.nextLine();
            System.out.print("Informe o seu bairro: ");
                String bairro = sc.nextLine();
            System.out.print("Informe a sua cidade: ");
                String cidade = sc.nextLine();
            System.out.print("Informe a sua unidade federativa: ");
                String UF = sc.nextLine();
            System.out.print("Informe o seu telefone: ");
                String telefone = sc.nextLine();
            System.out.print("Informe o seu email: ");
                String email = sc.nextLine();
            System.out.print("Informe o seu CNPJ: ");
                String CNPJ = sc.nextLine();
            System.out.print("Informe o seu website: ");
                String website = sc.nextLine();
            System.out.print("Informe o sua titulo: ");
                String titulacao = sc.nextLine();
            System.out.print("Informe as suas disciplinas: ");
                String disciplinas = sc.nextLine();

            Juridica j1 = new Juridica(nome, logradouro, numeroCasa, bairro, cidade, UF, telefone, email, disciplinas, razaoSocial, inscricaoEstadual, CNPJ, website);

            j1.cadastro();
        }
        else {
            System.out.println("Opção invalida!");
        }
    }
}