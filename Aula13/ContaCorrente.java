package Aula13;

public class ContaCorrente extends Conta implements GravarImposto{

    private double valorPermitido;

    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= informarSaldo()){
            setSaldo(informarSaldo() - valor);
        }else{
            System.out.println("NÃ£o tem limite!!");
        }
    }

    @Override
    public double imposto(double porc) {
        return 0;
    }
}
