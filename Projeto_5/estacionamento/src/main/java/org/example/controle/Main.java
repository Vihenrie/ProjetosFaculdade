package org.example.controle;

import org.example.MODEL.VeiculoCarga;
import org.example.MODEL.VeiculoPassageiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;

        System.out.println("\n<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Seja bem-vindo ao sistema de cadastramento de veiculos do Super estacionamento do vinicius");
        System.out.println("Primeiro digite - 1 - para caso o seu veiculo seja de CARGA ou - 2 - para caso o seu veiculo seja de PASSAGEIROS");
        System.out.print("Digite aqui: ");
            option = sc.nextInt();

            //Seria possivel para encurtar o código primeiro anotar todas as informações do carro e apenas depois perguntar
            //sobre o estilo do veiculo, porem, ai não faria sentido usar esquema de heranças sendo que com as classes normais iria funcionar igual
            //o código desse jeito fica BEMMMM maior e repetitivo para o exemplo desta atividade porem funciona no maior estilo XGH :P

            if (option == 1){
                System.out.println("\nO veiculo a ser cadastrado é de CARGA");

                System.out.print("\nInforme a placa do veiculo: ");
                    String placa = sc.next();
                System.out.print("Informe a marca do veiculo: ");
                    String marca = sc.next();
                System.out.print("Informe o modelo do veiculo: ");
                    String modelo = sc.next();
                System.out.print("Informe o ano do modelo do veiculo: ");
                    int anoModelo = sc.nextInt();
                System.out.print("Informe o ano de fabricação do veiculo: ");
                    int anoFabricacao = sc.nextInt();
                System.out.print("Informe o chassi do veiculo: ");
                    String chassi = sc.next();
                System.out.print("Informe o renavam do veiculo: ");
                    String renavam = sc.next();
                System.out.print("Informe a procedencia do veiculo: ");
                    String procedencia = sc.next();
                System.out.print("Informe a capacidade de carga do veiculo: ");
                    double capacidadeCarga = sc.nextDouble();
                System.out.print("Informe a altura do veiculo: ");
                    double altura = sc.nextDouble();
                System.out.print("Informe a largura do veiculo: ");
                    double largura = sc.nextDouble();
                System.out.print("Informe a profundidade do veiculo: ");
                    double profundidade = sc.nextDouble();
                System.out.print("Informe a cor externa do veiculo: ");
                    String corExterna = sc.next();
                System.out.print("Informe a cor interna do veiculo: ");
                    String corInterna = sc.next();
                System.out.print("Informe o tipo do combustivel do veiculo: ");
                    String tipoCombustivel = sc.next();
                System.out.print("Informe o motor do veiculo: ");
                    String motor = sc.next();
                System.out.print("Informe a quilometragem do veiculo: ");
                    double quilometragem = sc.nextDouble();
                System.out.print("Informe o consumo medio do veiculo: ");
                    double consumoMedio = sc.nextDouble();
                System.out.print("Informe a carga maxima do veiculo: ");
                    double cargaMaxima = sc.nextDouble();

                VeiculoCarga carga = new VeiculoCarga(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, capacidadeCarga,
                        altura, largura, profundidade, corExterna, corInterna, tipoCombustivel, motor, quilometragem, consumoMedio, cargaMaxima);

                System.out.println("\n=======================================================================");
                System.out.println("Essas são as informações cadastradas referente ao veiculo de CARGA");
                System.out.println("=======================================================================");

                System.out.println("\nA placa do veiculo é: "+ carga.getPlaca());
                System.out.println("A marca do veiculo é: " + carga.getMarca());
                System.out.println("O modelo do veiculo é: " + carga.getModelo());
                System.out.println("O ano do modelo do veiculo é: " + carga.getAnoModelo());
                System.out.println("O ano de fabricação do veiculo é: " + carga.getAnoFabricacao());
                System.out.println("O chassi do veiculo é: " + carga.getChassi());
                System.out.println("O renavam do veiculo é: " + carga.getRenavam());
                System.out.println("A procedencia do veiculo é: " + carga.getProcedencia());
                System.out.println("A capacidade de carga do veiculo é: " + carga.getCapacidadeCarga());
                System.out.println("A altura do veiculo é:" + carga.getAltura());
                System.out.println("A largura do veiculo é: " + carga.getLargura());
                System.out.println("A profundidade do veiculo é: " + carga.getProfundidade());
                System.out.println("A cor externa do veiculo é: " + carga.getCorExterna());
                System.out.println("A cor interna do veiculo é: " + carga.getCorInterna());
                System.out.println("O tipo de combustivel do veiculo é: " + carga.getTipoCombustivel());
                System.out.println("O tipo do motor do veiculo é: " + carga.getMotor());
                System.out.println("A quilometragem do veiculo é: " + carga.getQuilometragem());
                System.out.println("O consumo medio do veiculo é: " + carga.getConsumoMedio());
                System.out.println("A carga maxima do veiculo é: " + carga.getCargaMaxima());

            }
            else if (option == 2){
                System.out.println("\nO veiculo a ser cadastrado é de CARGA");

                System.out.print("\nInforme a placa do veiculo: ");
                    String placa = sc.next();
                System.out.print("Informe a marca do veiculo: ");
                    String marca = sc.next();
                System.out.print("Informe o modelo do veiculo: ");
                    String modelo = sc.next();
                System.out.print("Informe o ano do modelo do veiculo: ");
                    int anoModelo = sc.nextInt();
                System.out.print("Informe o ano de fabricação do veiculo: ");
                    int anoFabricacao = sc.nextInt();
                System.out.print("Informe o chassi do veiculo: ");
                    String chassi = sc.next();
                System.out.print("Informe o renavam do veiculo: ");
                    String renavam = sc.next();
                System.out.print("Informe a procedencia do veiculo: ");
                    String procedencia = sc.next();
                System.out.print("Informe a capacidade de carga do veiculo: ");
                    double capacidadeCarga = sc.nextDouble();
                System.out.print("Informe a altura do veiculo: ");
                    double altura = sc.nextDouble();
                System.out.print("Informe a largura do veiculo: ");
                    double largura = sc.nextDouble();
                System.out.print("Informe a profundidade do veiculo: ");
                    double profundidade = sc.nextDouble();
                System.out.print("Informe a cor externa do veiculo: ");
                    String corExterna = sc.next();
                System.out.print("Informe a cor interna do veiculo: ");
                    String corInterna = sc.next();
                System.out.print("Informe o tipo do combustivel do veiculo: ");
                    String tipoCombustivel = sc.next();
                System.out.print("Informe o motor do veiculo: ");
                    String motor = sc.next();
                System.out.print("Informe a quilometragem do veiculo: ");
                    double quilometragem = sc.nextDouble();
                System.out.print("Informe o consumo medio do veiculo: ");
                    double consumoMedio = sc.nextDouble();
                System.out.print("Informe o numero de portas do veiculo: ");
                    int numeroPortas = sc.nextInt();
                System.out.print("Informe o numero maximo de passageiros do veiculo: ");
                    int numeroPassageiros = sc.nextInt();

                VeiculoPassageiro passageiro = new VeiculoPassageiro(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, capacidadeCarga,
                        altura, largura, profundidade, corExterna, corInterna, tipoCombustivel, motor, quilometragem, consumoMedio, numeroPortas, numeroPassageiros);

                System.out.println("\n=======================================================================");
                System.out.println("Essas são as informações cadastradas referente ao veiculo de PASSAGEIROS");
                System.out.println("=======================================================================");

                System.out.println("\nA placa do veiculo é: "+ passageiro.getPlaca());
                System.out.println("A marca do veiculo é: " + passageiro.getMarca());
                System.out.println("O modelo do veiculo é: " + passageiro.getModelo());
                System.out.println("O ano do modelo do veiculo é: " + passageiro.getAnoModelo());
                System.out.println("O ano de fabricação do veiculo é: " + passageiro.getAnoFabricacao());
                System.out.println("O chassi do veiculo é: " + passageiro.getChassi());
                System.out.println("O renavam do veiculo é: " + passageiro.getRenavam());
                System.out.println("A procedencia do veiculo é: " + passageiro.getProcedencia());
                System.out.println("A capacidade de carga do veiculo é: " + passageiro.getCapacidadeCarga());
                System.out.println("A altura do veiculo é:" + passageiro.getAltura());
                System.out.println("A largura do veiculo é: " + passageiro.getLargura());
                System.out.println("A profundidade do veiculo é: " + passageiro.getProfundidade());
                System.out.println("A cor externa do veiculo é: " + passageiro.getCorExterna());
                System.out.println("A cor interna do veiculo é: " + passageiro.getCorInterna());
                System.out.println("O tipo de combustivel do veiculo é: " + passageiro.getTipoCombustivel());
                System.out.println("O tipo do motor do veiculo é: " + passageiro.getMotor());
                System.out.println("A quilometragem do veiculo é: " + passageiro.getQuilometragem());
                System.out.println("O consumo medio do veiculo é: " + passageiro.getConsumoMedio());
                System.out.println("O numero de portas do veiculo é: " + passageiro.getNumeroPortas());
                System.out.println("O numero maximo de passageiros é: " + passageiro.getNumeroPassageiros());
            }
            else {
                System.out.println("\nOpção invalida!");
            }


    }
}