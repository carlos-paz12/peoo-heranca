package br.edu.ifrn.peoo.heranca;

public class Teste {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica("XXX-XXX-XXX", "XX-XXX-XX", "XX-XX-XX", "XXXXXX", "XXX XXXXX XXXXXXXX", "XX XXXXX-XXXX");

        /* p.setCpf();
           p.setCnpj();
           Os métodos acima não são executados pois uma super classe
           não pode acessar os métodos de suas subclasses */
        
        /* Saída do código: Pessoa
                            Pessoa
                            PessoaFisica */
    }

}
