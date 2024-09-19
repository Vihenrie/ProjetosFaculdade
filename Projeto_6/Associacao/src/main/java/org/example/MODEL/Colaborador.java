package org.example.MODEL;

public class Colaborador extends Pessoa{

    private String cargo;

    public Colaborador(int ID, String nome, String logradouro, int numeroCasa, String CEP, String bairro, String cidade, String UF, String telefone, String CPF_CNPJ, String cargo) {
        super(ID, nome, logradouro, numeroCasa, CEP, bairro, cidade, UF, telefone, CPF_CNPJ);

        this.cargo = cargo;

    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
