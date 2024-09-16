package org.example;

public class aluno {

    String nome, endereco, telefone, email, matricula;

    public String getAllInfo() {
        String allInfo = "O nome do aluno é " + nome + " que mora no endereço "+endereco+" com o telefone "+telefone+" com o email de contato "+email+" e com o numero de matricula "+ matricula;
        return allInfo;
    }
}
