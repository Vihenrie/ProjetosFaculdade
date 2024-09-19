package org.example.MODEL;

public class Fornecedor extends Pessoa{

    private String nomeFarmacia;
    private String website;

    public Fornecedor(int ID, String nome, String logradouro, int numeroCasa, String CEP, String bairro, String cidade, String UF, String telefone, String CPF_CNPJ, String nomeFarmacia, String website) {
        super(ID, nome, logradouro, numeroCasa, CEP, bairro, cidade, UF, telefone, CPF_CNPJ);

        this.nomeFarmacia = nomeFarmacia;
        this.website = website;

    }
    public String getNomeFarmacia() {
        return nomeFarmacia;
    }

    public void setNNomeFarmacia(String nomeFarmacia) {
        this.nomeFarmacia = nomeFarmacia;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
