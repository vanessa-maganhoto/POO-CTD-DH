package Aula11MesaDeTrabalho;

public class Principal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Ricoto", 2);
        Cavalo cavalo = new Cavalo ("Nave", 10);
        Preguica p = new Preguica("Dorminhoca", 7);

        System.out.println(c.emiteSom());
        System.out.println(c.locomover());

        System.out.println(cavalo.emiteSom());
        System.out.println(cavalo.locomover());

        System.out.println(p.emiteSom());
        System.out.println(p.subirArvore());

    }
}
