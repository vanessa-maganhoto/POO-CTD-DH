package Aula11MesaDeTrabalho;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public String emiteSom(){

        return "O cachorro late";
    }


    public String locomover() {
        return "O cachorro corre";
    }
}
