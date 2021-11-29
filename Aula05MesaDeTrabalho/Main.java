package Aula05MesaDeTrabalho;

public class Main {
    public static void main(String[] args){
        UsuarioJogo usuario1 = new UsuarioJogo("Mateus", "mbd");
        UsuarioJogo usuario2 = new UsuarioJogo("Benites", "ben");
        usuario1.setPontuacao(487);
        usuario2.setPontuacao(90);
        usuario1.subirNivel();
        usuario2.subirNivel();
        System.out.println("Pontuação do usuario1: " + usuario1.getPontuacao());
        usuario1.bonus(110);
        System.out.println("Pontuação do usuario1: " + usuario1.getPontuacao());
        System.out.println("Nível do usuario1: " + usuario1.getNivel());
        System.out.println("Nível do usuario2: " + usuario2.getNivel());

        for (int i = 1; i <= 28; i++){
            usuario2.aumentarPontuacao();
        }

        System.out.println("Pontuação do usuario2: " + usuario2.getPontuacao());
        usuario2.subirNivel();
        System.out.println("Pontuação do usuario2: " + usuario2.getPontuacao());
        System.out.println("Nível do usuario2: " + usuario2.getNivel());

        usuario1.setNome("V...");
        String n = usuario1.getNome();
    }

}
