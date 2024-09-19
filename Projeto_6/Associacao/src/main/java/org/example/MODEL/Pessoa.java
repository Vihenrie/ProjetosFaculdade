package org.example.MODEL;

public class Pessoa {

    private int ID;
    private String nome;
    private String logradouro;
    private int numeroCasa;
    private String CEP;
    private String bairro;
    private String cidade;
    private String UF;
    private String telefone;
    private String CPF_CNPJ;

    public Pessoa(int ID, String nome, String logradouro, int numeroCasa, String CEP, String bairro, String cidade, String UF, String telefone, String CPF_CNPJ){
        this.ID = ID;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numeroCasa = numeroCasa;
        this.CEP = CEP;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
        this. telefone = telefone;
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }
}
