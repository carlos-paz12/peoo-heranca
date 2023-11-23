package br.edu.ifrn.peoo.heranca;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String inscrMunicipal;
    private String inscrEstadual;

    public PessoaJuridica() {
        super();
        System.out.println("PessoaJuridica");
    }

    public PessoaJuridica(String cnpj, String inscrMunicipal, String inscrEstadual, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscrMunicipal = inscrMunicipal;
        this.inscrEstadual = inscrEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscrMunicipal() {
        return inscrMunicipal;
    }

    public void setInscrMunicipal(String inscrMunicipal) {
        this.inscrMunicipal = inscrMunicipal;
    }

    public String getInscrEstadual() {
        return inscrEstadual;
    }

    public void setInscrEstadual(String inscrEstadual) {
        this.inscrEstadual = inscrEstadual;
    }

}
