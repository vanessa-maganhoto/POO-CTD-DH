package Aula10MesaDeTrabalho;

public class Asteroide extends Objeto{
    private int danos;

    public Asteroide(int x, int y, char direcao, int danos) {
        super(x, y, direcao);
        this.danos = danos;
    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "danos=" + danos +
                ", posx=" + posx +
                ", posy=" + posy +
                ", direcao=" + direcao +
                '}';
    }
}
