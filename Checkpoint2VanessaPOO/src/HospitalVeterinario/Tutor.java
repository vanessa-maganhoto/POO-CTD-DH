package HospitalVeterinario;

import java.time.LocalDate;
import java.util.ArrayList;

public  class Tutor extends Pessoa{
    private ArrayList<Animal> animais;

    public Tutor(String nomeCompleto, LocalDate dataNasc, String endereco, int telContato, String rg, String cpf, String urlFotoCadastro, LocalDate dataInicio){
        super(nomeCompleto, dataNasc, endereco, telContato, rg, cpf, urlFotoCadastro,dataInicio);
        this.animais = new ArrayList<>();

    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    public void pagar(){

    }

    public void addAnimal(Animal a){
        this.animais.add(a);
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", dataNasc=" + dataNasc +
                ", endereco='" + endereco + '\'' +
                ", telContato=" + telContato +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", urlFotoCadastro='" + urlFotoCadastro + '\'' +
                ", dataInicio=" + dataInicio +
                ", animais=" + animais +
                '}';
    }
}
