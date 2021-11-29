package Aula12MesaDeTrabalho;

public class Teste {

    public static void main(String[] args) {
        Assistente a1 = new Assistente("Marcia", 2500, "131569");
        Tecnico t1 = new Tecnico("Matias", 3600, "785210");
        Administrativo ad1 = new Administrativo("Marcela", 1890, "145420", "noite", 100);


        a1.addAumento(300);
        a1.exibeDados();

        t1.ganhoAnual();
        t1.exibeDados();

        ad1.setAdicionalNoturno(100);
        ad1.ganhoAnual();
        ad1.exibeDados();

    }
}
