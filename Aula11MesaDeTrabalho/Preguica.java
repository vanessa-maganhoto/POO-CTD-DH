package Aula11MesaDeTrabalho;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emiteSom() {
        return "A preguiça não emite som";
    }

    public Boolean subirArvore(){
        return true;
    }
}
