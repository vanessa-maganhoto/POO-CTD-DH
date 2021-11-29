package HospitalVeterinario;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncionarioAdministrativo extends Pessoa{
    private double salario;
    private String cargo;
    private int cargaHorariaMensal;

    public FuncionarioAdministrativo(String nomeCompleto, LocalDate dataNasc, String endereco, int telContato, String rg, String cpf, String urlFotoCadastro, LocalDate dataInicio, double salario, String cargo, int cargaHorariaMensal) {
        super(nomeCompleto, dataNasc, endereco, telContato, rg, cpf, urlFotoCadastro, dataInicio);
        this.salario = salario;
        this.cargo = cargo;
        this.cargaHorariaMensal = cargaHorariaMensal;
    }

    public void setCargaHorariaMensal(int cargaHorariaMensal) {
        this.cargaHorariaMensal = cargaHorariaMensal;
    }

    public void abrirFicha (Animal a, Veterinario v){
        Scanner abrirFicha = new Scanner(System.in);
        System.out.println( a.getNome() + " deu entrada hoje e será atendido(a) pelo profissional  " + v.getNomeCompleto());
    }

    public void receberPagamento (Animal a, Veterinario v){
        Scanner pag = new Scanner(System.in);
        System.out.println("Valor dos serviços prestados?  ");
        Double valorPag = pag.nextDouble();
        System.out.println("As despesas de " + a.getNome() + " totalizam R$ " + valorPag + " e o referido valor será redirecionado para " + v.getNomeCompleto());
    }

    public void encerrarAtendimento(Animal a, Veterinario v){
        Scanner eAtendimento = new Scanner(System.in);
        System.out.println("O atendimento de " + a.getNome() + " foi finalizado. O profissional " + v.getNomeCompleto() + " está livre para iniciar outro atendimento.");
    }

    @Override
    public String toString() {
        return "FuncionarioAdministrativo{"+
                "nome completo=" + nomeCompleto +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                ", cargaHorariaMensal=" + cargaHorariaMensal +
                '}';
    }
}
