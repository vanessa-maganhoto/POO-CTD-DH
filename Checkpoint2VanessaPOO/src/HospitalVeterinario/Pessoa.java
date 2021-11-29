package HospitalVeterinario;

import java.time.LocalDate;

public abstract class Pessoa {
    protected String nomeCompleto;
    protected LocalDate dataNasc;
    protected String endereco;
    protected int telContato;
    protected String rg;
    protected String cpf;
    protected String urlFotoCadastro;
    protected LocalDate dataInicio;

    public Pessoa(String nomeCompleto, LocalDate dataNasc, String endereco, int telContato, String rg, String cpf, String urlFotoCadastro, LocalDate dataInicio) {
        this.nomeCompleto = nomeCompleto;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.telContato = telContato;
        this.rg = rg;
        this.cpf = cpf;
        this.urlFotoCadastro = urlFotoCadastro;
        this.dataInicio = dataInicio;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelContato() {
        return telContato;
    }

    public void setTelContato(int telContato) {
        this.telContato = telContato;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUrlFotoCadastro() {
        return urlFotoCadastro;
    }

    public void setUrlFotoCadastro(String urlFotoCadastro) {
        this.urlFotoCadastro = urlFotoCadastro;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
}
