package org.example.controle;

import org.example.MODEL.Cliente;
import org.example.MODEL.Veiculo;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== Cadastro de Cliente ===");
        System.out.print("Informe o seu nome: ");
            String nome = sc.nextLine();
        System.out.print("Informe o seu CPF: ");
            String cpf = sc.nextLine();
        System.out.print("Informe o seu endereço: ");
            String endereco = sc.nextLine();
        System.out.print("Informe o seu numero de telefone: ");
            String telefone = sc.nextLine();
        System.out.print("Informe o seu email: ");
            String email = sc.nextLine();

        Cliente cliente1 = new Cliente(nome, cpf, endereco, telefone, email);

        System.out.println("\n=== Cadastro do veiculo ===");
        System.out.print("Informe a sua placa: ");
            String placa = sc.nextLine();
        System.out.print("Informe o seu modelo: ");
            String modelo = sc.nextLine();
        System.out.print("Informe o seu ano: ");
            int ano = sc.nextInt();
            sc.nextLine();
        System.out.print("Informe o seu fabricante: ");
            String fabricante = sc.nextLine();
        System.out.print("Informe a sua cor: ");
            String cor = sc.nextLine();

        Veiculo veiculo1 = new Veiculo(placa, modelo, ano, fabricante, cor);

        System.out.println("\n=== Dados do Cliente ===");
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
        System.out.println("E-mail: " + cliente1.getEmail());

        System.out.println("\n=== Dados do Veículo ===");
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Modelo: " + veiculo1.getModelo());
        System.out.println("Ano: " + veiculo1.getAno());
        System.out.println("Fabricante: " + veiculo1.getFabricante());
        System.out.println("Cor: " + veiculo1.getCor());

    }
}