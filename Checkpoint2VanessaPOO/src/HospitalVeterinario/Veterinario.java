package HospitalVeterinario;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Veterinario extends Pessoa{
    private String numConselho;
    private boolean realizaCirurgia;
    private String [] diasPlantao;
    private double valorPlantao;
    private String especialidade;

    public Veterinario(String nomeCompleto, LocalDate dataNasc, String endereco, int telContato, String rg, String cpf, String urlFotoCadastro, LocalDate dataInicio, String numConselho, boolean realizaCirurgia, String[] diasPlantao, double valorPlantao, String especialidade) {
        super(nomeCompleto, dataNasc, endereco, telContato, rg, cpf, urlFotoCadastro, dataInicio);
        this.numConselho = numConselho;
        this.realizaCirurgia = realizaCirurgia;
        this.diasPlantao = diasPlantao;
        this.valorPlantao = valorPlantao;
        this.especialidade = especialidade;
    }

    public void examinar(Animal a){
        System.out.println("Os exames clínicos em " + a.getNome() + " foram realizados.");
    }

    public void prescreverRemedio(Animal a){
        Scanner entradaAnimal = new Scanner(System.in);
        System.out.println("Após os exames clínicos e laboratoriais " + a.getNome() + " precisará de medicamentos?");
        String resposta = entradaAnimal.next();
        if (resposta.equals("sim")){
            System.out.println("Dirija-se à recepção para pegar a receita.");
        } else {
            System.out.println( a.getNome() + " não tem nenhuma prescrição de medicamentos. Se precisar, volte no retorno em até 30 dias.");
        }
    }

    public void pedirExames(Animal a){
        Scanner exameAnimal = new Scanner(System.in);
        System.out.println( a.getNome() + " + preisará de exames? ");
        String resposta = exameAnimal.next();
        if (resposta.equals("sim")){
            System.out.println("Quais exames " + a.getNome() + " realizará? ");
            String respExame = exameAnimal.next();
            System.out.println(a.getNome() + " precisará realizar os exames: " + respExame);
        }
    }

    public void  emitirOrientacoes(Animal a){
        System.out.println(getNomeCompleto() + " examinou " + a.getNome() + " orientou verbalmente o tutor sobre o manejo para seu quadro clínico. Para pegar a versão impressa digirja-se à recepção.");
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                ", Nome completo= " + nomeCompleto +
                ", numConselho='" + numConselho + '\'' +
                ", realizaCirurgia=" + realizaCirurgia +
                ", diasPlantao=" + Arrays.toString(diasPlantao) +
                ", valorPlantao=" + valorPlantao +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
