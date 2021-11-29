package Aula06MesaDeTrabalho;

public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("AAA", "vira lata", 2017, 3f, false, false);
        cachorro1.idade();
        cachorro1.estaApto();

        Cachorro theodor = new Cachorro("Theodor", "Maltês branco", 2018, 5f, true, false);
        theodor.idade();
        theodor.estaApto();
    }
}
