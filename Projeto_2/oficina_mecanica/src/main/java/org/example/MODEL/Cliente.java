package org.example.MODEL;

public class Cliente {

    public String getCpf;
    private String cpf;
        private String nome;
        private String endereco;
        private String telefone;
        private String email;

        public Cliente(String cpf, String nome, String endereco, String telefone, String email){
            this.cpf = cpf;
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
            this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
