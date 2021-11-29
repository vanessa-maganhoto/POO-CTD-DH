package HospitalVeterinario;

import java.time.LocalDate;

public class Animal {

    private String nome;
    private Tutor tutor;
    private String categoria;
    private String porte;
    private String caracteristicasFisicas;
    private String urlFotoCadastro;
    private int numProntuario;
    private double peso;
    private LocalDate dataNasc;

    public Animal(String nome, Tutor tutor, String categoria, String porte, String caracteristicasFisicas, String urlFotoCadastro, int numProntuario, double peso, LocalDate dataNasc) {
        this.nome = nome;
        this.tutor = tutor;
        this.categoria = categoria;
        this.porte = porte;
        this.caracteristicasFisicas = caracteristicasFisicas;
        this.urlFotoCadastro = urlFotoCadastro;
        this.numProntuario = numProntuario;
        this.peso = peso;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCaracteristicasFisicas() {
        return caracteristicasFisicas;
    }

    public void setCaracteristicasFisicas(String caracteristicasFisicas) {
        this.caracteristicasFisicas = caracteristicasFisicas;
    }

    public String getUrlFotoCadastro() {
        return urlFotoCadastro;
    }

    public void setUrlFotoCadastro(String urlFotoCadastro) {
        this.urlFotoCadastro = urlFotoCadastro;
    }

    public int getNumProntuario() {
        return numProntuario;
    }

    public void setNumProntuario(int numProntuario) {
        this.numProntuario = numProntuario;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", tutor=" + tutor.getNomeCompleto() +
                ", categoria='" + categoria + '\'' +
                ", porte='" + porte + '\'' +
                ", caracteristicasFisicas='" + caracteristicasFisicas + '\'' +
                ", urlFotoCadastro='" + urlFotoCadastro + '\'' +
                ", numProntuario=" + numProntuario +
                ", peso=" + peso +
                ", dataNasc=" + dataNasc +
                '}';
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
}
