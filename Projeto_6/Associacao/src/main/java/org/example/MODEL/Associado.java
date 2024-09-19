package org.example.MODEL;

public class Associado extends Pessoa{

    private String situacao;
    private int num_associado;

    public Associado(int ID, String nome, String logradouro, int numeroCasa, String CEP, String bairro, String cidade, String UF, String telefone, String CPF_CNPJ, String situacao, int num_associado) {
        super(ID, nome, logradouro, numeroCasa, CEP, bairro, cidade, UF, telefone, CPF_CNPJ);

        this.situacao = situacao;
        this.num_associado = num_associado;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getNum_associado() {
        return num_associado;
    }

    public void setNum_associado(int num_associado) {
        this.num_associado = num_associado;
    }
}
