package br.edu.ifrn.peoo.heranca;

import java.util.Date;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;
    private Date dataNascimento;

    public PessoaFisica() {
        super();
        System.out.println("PessoaFisica");
    }

    public PessoaFisica(String cpf, String rg, Date dataNascimento, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
