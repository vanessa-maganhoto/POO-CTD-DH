package Aula05;

public class Principal {
    public static void main(String[] args) {

        Cliente c = new Cliente(123, "Diego");
        System.out.println(c.getNome());
        c.aumentarDivida(100);
        c.pagarDivida(10);
        System.out.println(c.getDivida());
    }
}
