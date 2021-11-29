package Aula12MesaDeTrabalho;

public class Assistente extends Funcionario{

    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Assistente(String nome, double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public void exibeDados() {
        System.out.println("O funcionario " + getNome() + " de matricula " + matricula + " recebe R$ " + getSalario() + " de salário");
    }
}
