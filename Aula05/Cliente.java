package Aula05;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private double divida;

    public Cliente(int numero, String nome) {
        this.numeroCliente = numero;
        this.nome = nome;
        this.divida = 0;
    }

    public String getNome (){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCliente() {
        return this.numeroCliente;
    }

    public double getDivida(){
        return this.divida;
    }
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public void aumentarDivida(double valor) {
        this.divida += valor;
        System.out.println("Sua dívida agora é de: " + this.divida);
    }

    public void pagarDivida(double valor) {
        if (this.divida == 0) {
            System.out.println("Você não tem dívida!");
        } else {
            this.divida -= valor;
        }
    }
}


