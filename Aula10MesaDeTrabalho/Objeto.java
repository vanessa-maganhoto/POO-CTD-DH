package Aula10MesaDeTrabalho;

public class Objeto {

    protected int posx;
    protected int posy;
    protected char direcao;


    public Objeto (int x, int y, char direcao){
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }

    public void irA (int x, int y, char direcao){
        System.out.println("Você está nas posições " + x + " e " + y + " na direção " + direcao);
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
    }


}

// Mesa Aula 10 = Sala 1 => Andre Padilha, Thyano Santos, João Vitor Dutra, Lelia Salles, Francieli Celeghim