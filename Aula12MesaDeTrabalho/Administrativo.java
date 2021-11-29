package Aula12MesaDeTrabalho;

public class Administrativo extends Assistente {

    private String turno;
    private double adicionalNoturno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public Administrativo(String nome, double salario, String matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public void ganhoAnual() {
        if ( turno.equals("noite")){
            System.out.println((getSalario() + adicionalNoturno) * 12);
        } else{
            System.out.println(getSalario() * 12);
        }
    }
}
