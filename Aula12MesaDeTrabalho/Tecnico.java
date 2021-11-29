package Aula12MesaDeTrabalho;

public class Tecnico extends Assistente{

    private double bonusSalarial;

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public void ganhoAnual() {
        System.out.println("O salario anual é " + (getSalario() + bonusSalarial) *12);
    }

    public Tecnico(String nome, double salario, String matricula) {
        super(nome, salario, matricula);
    }
}
