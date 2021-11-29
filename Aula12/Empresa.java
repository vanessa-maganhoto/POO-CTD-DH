package Aula12;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private String cnpj;
    // private Funcionario funcionario;
    private ArrayList<Funcionario> listafuncionarios = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void addFuncionario(Funcionario funcionario){
        listafuncionarios.add(funcionario);
    }
}
