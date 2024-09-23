package org.example.MODEL;

public class Juridica extends Pessoa{

    private String razaoSocial;
    private int inscricaoEstadual;
    private String CNPJ;
    private String website;


    public Juridica(String nome, String logradouro, int numeroCasa, String bairro, String cidade, String UF, String telefone,
                    String email, String disciplinas, String razaoSocial, int inscricaoEstadual, String CNPJ, String website) {
        super(nome, logradouro, numeroCasa, bairro, cidade, UF, telefone, email, disciplinas);

        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.CNPJ = CNPJ;
        this.website = website;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public void cadastro() {
        System.out.println("\n======================================================================================");
        System.out.println("* A sua razão social é: "+ getRazaoSocial());
        System.out.println("* O nome da pessoa é: "+ getNome());
        System.out.println("* O seu CNPJ é: "+ getCNPJ());
        System.out.println("* A sua incrição social é: "+ getInscricaoEstadual());
        System.out.println("* O seu logradouro é: "+ getLogradouro());
        System.out.println("* O numero da sua casa é: "+ getNumeroCasa());
        System.out.println("* O seu bairro é: "+ getBairro());
        System.out.println("* A sua cidade é: " + getCidade());
        System.out.println("* A sua unidade federativa é: "+ getUF());
        System.out.println("* O seu telefone é: "+ getTelefone());
        System.out.println("* O seu email é: "+ getEmail());
        System.out.println("* O seu website é: "+getWebsite());
        System.out.println("* As suas disciplinas são: "+ getDisciplinas());
        System.out.println("======================================================================================");
    }
}
