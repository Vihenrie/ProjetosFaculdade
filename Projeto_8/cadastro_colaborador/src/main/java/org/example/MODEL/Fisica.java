package org.example.MODEL;

public class Fisica extends Pessoa{

    private String CPF;
    private String RG;
    private int idade;
    private String titulacao;

    public Fisica(String nome, String logradouro, int numeroCasa, String bairro, String cidade, String UF, String telefone,
                  String email, String disciplinas, String CPF, String RG, int idade, String titulacao) {
        super(nome, logradouro, numeroCasa, bairro, cidade, UF, telefone, email, disciplinas);

        this.CPF = CPF;
        this.RG = RG;
        this.idade = idade;
        this.titulacao = titulacao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public void cadastro() {
        System.out.println("\n======================================================================================");
        System.out.println("* O nome da pessoa é: "+ getNome());
        System.out.println("* A sua idade é: "+ getIdade());
        System.out.println("* O seu CPF é: "+ getCPF());
        System.out.println("* O seu RG é: "+ getRG());
        System.out.println("* O seu logradouro é: "+ getLogradouro());
        System.out.println("* O numero da sua casa é: "+ getNumeroCasa());
        System.out.println("* O seu bairro é: "+ getBairro());
        System.out.println("* A sua cidade é: " + getCidade());
        System.out.println("* A sua unidade federativa é: "+ getUF());
        System.out.println("* O seu telefone é: "+ getTelefone());
        System.out.println("* O seu email é: "+ getEmail());
        System.out.println("* A sua titulação é: "+getTitulacao());
        System.out.println("* As suas disciplinas são: "+ getDisciplinas());
        System.out.println("======================================================================================");
    }
}
