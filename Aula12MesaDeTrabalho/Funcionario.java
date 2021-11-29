package Aula12MesaDeTrabalho;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void addAumento(double valor){
        this.salario = valor + salario;
    }

    public void ganhoAnual(){
        System.out.println("O salario anual é " + (salario*12));
    }

    public void exibeDados(){
        System.out.println("O funcionario " + nome + "recebe R$ " + salario + " de salário");
    }
}
