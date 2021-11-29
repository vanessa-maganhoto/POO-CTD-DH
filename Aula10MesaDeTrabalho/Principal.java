package Aula10MesaDeTrabalho;

public class Principal {
    public static void main(String[] args) {
        Nave nave1 = new Nave(10,10,'n',100);
        Asteroide asteroide1 = new Asteroide(3,5,'s',250);
        System.out.println(nave1);
        System.out.println(asteroide1);

        nave1.irA(15,20,'n');
        asteroide1.irA(10,12,'l');
    }
}
