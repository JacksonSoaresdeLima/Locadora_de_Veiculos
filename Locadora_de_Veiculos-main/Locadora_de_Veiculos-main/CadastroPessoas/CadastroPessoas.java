package CadastroPessoas;

import java.util.ArrayList;

public class CadastroPessoas {
    private ArrayList<PessoaJuridica> pessoas1 = new ArrayList<>();

    public void cadastrarPessoa(PessoaJuridica pj) {
        pessoas1.add(pj);
        System.out.println("CadastroPessoas.Pessoa cadastrada com sucesso!");
    }

    public void listarpj(){
        for (PessoaJuridica pj : pessoas1) {
            System.out.println("Nome/Empresa:" + pj.getNome() + "\n Idade:" + pj.getIdade() + "\n Cnpj: " + pj.getCnpj());
        }
    }

    private ArrayList<PessoaFisica> pessoas2 = new ArrayList<>();

    public void cadastrarPessoa(PessoaFisica pf) {
        pessoas2.add(pf);
        System.out.println("CadastroPessoas.Pessoa cadastrada com sucesso!");
    }

    public void listarpf(){
        for (PessoaFisica pf : pessoas2) {
            System.out.println("Nome: " + pf.getNome() + "\n Idade: " + pf.getIdade() + "\n Cpf: " + pf.getCpf());
        }
    }
}


