package Aula11MesaDeTrabalho;

public class Cavalo extends  Animal{
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }


    @Override
    public String emiteSom() {
        return "O cavalo relincha";
    }

    public String locomover() {
        return "O cavalo corre";
    }
}
