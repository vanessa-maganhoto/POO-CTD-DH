package Aula10MesaDeTrabalho;

public class Nave extends Objeto{
    private double velocidade;
    private int vida;

    public Nave (int x, int y, char direcao, double velocidade){
        super (x, y, direcao);
        this.velocidade = velocidade;
    }

    public void girar(char direcao){
        this.direcao = direcao;
    }

    public void restaVida(int valor){

        this.vida = valor;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidade=" + velocidade +
                ", vida=" + vida +
                ", posx=" + posx +
                ", posy=" + posy +
                ", direcao=" + direcao +
                '}';
    }
}


