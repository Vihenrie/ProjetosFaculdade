package org.example.controler;

import org.example.MODEL.Associado;
import org.example.MODEL.Colaborador;
import org.example.MODEL.Fornecedor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option;

        System.out.println("\n<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Seja bem-vindo ao sistema de cadastrados os estabelecimentos e farmácias associadas à matriz, fornecedores de medicamentos e colaboradores");
        System.out.println("Primeiro digite - 1 - para cadastrar ASSOCIADOS - 2 - para cadastrar COLABORADORES - 3 - para cadastrar FORNECEDORES");
        System.out.print("Digite aqui a opção: ");
            option = sc.nextInt();

            //ASSOCIADO
        if (option == 1){
            System.out.println("\nO tipo de cadastramento selecionado é para ASSOCIADOS");

            System.out.print("\nInforme o ID do funcionario: ");
                int ID = sc.nextInt();
                    sc.nextLine();
            System.out.print("Informe o nome do funcionario: ");
                String nome = sc.nextLine();
            System.out.print("Informe o logradouro do funcionario: ");
                String logradouro = sc.nextLine();
            System.out.print("Informe o numero da casa do funcionario: ");
                int numeroCasa = sc.nextInt();
                    sc.nextLine();
            System.out.print("Informe o CEP da casa do funcionario: ");
                String CEP = sc.nextLine();
            System.out.print("Informe o bairro do funcionario: ");
                String bairro = sc.nextLine();
            System.out.print("Informe a cidade do funcionario: ");
                String cidade = sc.nextLine();
            System.out.print("Informe a UF do funcionario: ");
                String UF = sc.nextLine();
            System.out.print("Informe o telefone do funcionario: ");
                String telefone = sc.nextLine();
            System.out.print("Informe o CPF ou CNPJ do funcionario: ");
                String CPF_CNPJ = sc.nextLine();
            System.out.print("Informe o numero de associação do funcionario: ");
                int num_associado = sc.nextInt();
                    sc.nextLine();
            System.out.print("Informe a situação do associado: ");
                String situacao = sc.nextLine();

            Associado associado = new Associado(ID, nome, logradouro, numeroCasa, CEP, bairro, cidade, UF, telefone, CPF_CNPJ, situacao, num_associado);

            System.out.println("\n=======================================================================");
            System.out.println("Essas são as informações cadastradas referente aos ASSOCIADOS");
            System.out.println("=======================================================================");

            System.out.println("\nO funcionario "+ associado.getNome()+" que possui o ID "+associado.getID()+ " Possui os seguintes cadastros: ");
            System.out.println("Logradouro: "+associado.getLogradouro());
            System.out.println("Numero da casa: "+ associado.getNumeroCasa());
            System.out.println("CEP: "+ associado.getCEP());
            System.out.println("Bairro: "+ associado.getBairro());
            System.out.println("Cidade: "+ associado.getCidade());
            System.out.println("UF: "+ associado.getUF());
            System.out.println("telefone: "+ associado.getTelefone());
            System.out.println("CPF/CNPJ: "+ associado.getCPF_CNPJ());
            System.out.println("situação do associado: "+ associado.getSituacao());
            System.out.println("numero do associado: "+ associado.getNum_associado());

            sc.close();
        }
        // COLABORADOR
        else if(option == 2){
            System.out.println("\nO tipo de cadastramento selecionado é para COLABORADOR");

            System.out.print("\nInforme o ID do funcionario: ");
                int ID = sc.nextInt();
                    sc.nextLine();
            System.out.print("Informe o nome do funcionario: ");
                String nome = sc.nextLine();
            System.out.print("Informe o logradouro do funcionario: ");
                String logradouro = sc.nextLine();
            System.out.print("Informe o numero da casa do funcionario: ");
                int numeroCasa = sc.nextInt();
                    sc.nextLine();
            System.out.print("Informe o CEP da casa do funcionario: ");
                String CEP = sc.nextLine();
            System.out.print("Informe o bairro do funcionario: ");
                String bairro = sc.nextLine();
            System.out.print("Informe a cidade do funcionario: ");
                String cidade = sc.nextLine();
            System.out.print("Informe a UF do funcionario: ");
                String UF = sc.nextLine();
            System.out.print("Informe o telefone do funcionario: ");
                String telefone = sc.nextLine();
            System.out.print("Informe o CPF ou CNPJ do funcionario: ");
                String CPF_CNPJ = sc.nextLine();
            System.out.print("Informe o cargo do colaborador: ");
                String cargo = sc.nextLine();

            Colaborador colaborador = new Colaborador(ID, nome, logradouro, numeroCasa, CEP, bairro, cidade, UF, telefone, CPF_CNPJ, cargo);

            System.out.println("\n=======================================================================");
            System.out.println("Essas são as informações cadastradas referente ao COLABORADOR");
            System.out.println("=======================================================================");

            System.out.println("\nO funcionario "+ colaborador.getNome()+" que possui o ID "+colaborador.getID()+ " Possui os seguintes cadastros: ");
            System.out.println("Logradouro: "+colaborador.getLogradouro());
            System.out.println("Numero da casa: "+ colaborador.getNumeroCasa());
            System.out.println("CEP: "+ colaborador.getCEP());
            System.out.println("Bairro: "+ colaborador.getBairro());
            System.out.println("Cidade: "+ colaborador.getCidade());
            System.out.println("UF: "+ colaborador.getUF());
            System.out.println("telefone: "+ colaborador.getTelefone());
            System.out.println("CPF/CNPJ: "+ colaborador.getCPF_CNPJ());
            System.out.println("Cargo: "+ colaborador.getCargo());

            sc.close();
        }
        //FORNECEDOR
        else if (option == 3) {
            System.out.println("\nO tipo de cadastramento selecionado é para FORNECEDOR");

            System.out.print("\nInforme o ID do funcionario: ");
                int ID = sc.nextInt();
                sc.nextLine();
            System.out.print("Informe o nome do funcionario: ");
                String nome = sc.nextLine();
            System.out.print("Informe o logradouro do funcionario: ");
                String logradouro = sc.nextLine();
            System.out.print("Informe o numero da casa do funcionario: ");
                int numeroCasa = sc.nextInt();
                    sc.nextLine();
            System.out.print("Informe o CEP da casa do funcionario: ");
                String CEP = sc.nextLine();
            System.out.print("Informe o bairro do funcionario: ");
                String bairro = sc.nextLine();
            System.out.print("Informe a cidade do funcionario: ");
                String cidade = sc.nextLine();
            System.out.print("Informe a UF do funcionario: ");
                String UF = sc.nextLine();
            System.out.print("Informe o telefone do funcionario: ");
                String telefone = sc.nextLine();
            System.out.print("Informe o CPF ou CNPJ do funcionario: ");
                String CPF_CNPJ = sc.nextLine();
            System.out.print("Informe o nome da farmacia: ");
                String nomeFarmacia = sc.nextLine();
            System.out.print("Informe o website: ");
                String website = sc.nextLine();

            Fornecedor fornecedor = new Fornecedor(ID, nome, logradouro, numeroCasa, CEP, bairro, cidade, UF, telefone, CPF_CNPJ, nomeFarmacia, website);

            System.out.println("\n=======================================================================");
            System.out.println("Essas são as informações cadastradas referente ao FORNECEDOR");
            System.out.println("=======================================================================");

            System.out.println("\nO funcionario "+ fornecedor.getNome()+" que possui o ID "+fornecedor.getID()+ " Possui os seguintes cadastros: ");
            System.out.println("Logradouro: "+fornecedor.getLogradouro());
            System.out.println("Numero da casa: "+ fornecedor.getNumeroCasa());
            System.out.println("CEP: "+ fornecedor.getCEP());
            System.out.println("Bairro: "+ fornecedor.getBairro());
            System.out.println("Cidade: "+ fornecedor.getCidade());
            System.out.println("UF: "+ fornecedor.getUF());
            System.out.println("telefone: "+ fornecedor.getTelefone());
            System.out.println("CPF/CNPJ: "+ fornecedor.getCPF_CNPJ());
            System.out.println("Nome da farmacia: "+ fornecedor.getNomeFarmacia());
            System.out.println("Website: "+ fornecedor.getWebsite());

            sc.close();
        }
        else{
            System.out.println("Opção invalida!");
        }


    }
}