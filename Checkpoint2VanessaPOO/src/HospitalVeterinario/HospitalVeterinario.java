package HospitalVeterinario;

import java.util.ArrayList;

public class HospitalVeterinario {

    protected ArrayList<FuncionarioAdministrativo> listaFuncionariosAdm = new ArrayList<>();
    protected  ArrayList<Tutor> listaTutor = new ArrayList<>();
    protected  ArrayList<Veterinario> listaVeterinario = new ArrayList<>();
    protected  ArrayList<Animal> listaAnimal = new ArrayList<>();

    public HospitalVeterinario() {

    }

    @Override
    public String toString() {
        return "Hospital Veterinário{" +
                "listaFuncionariosAdm=" + listaFuncionariosAdm +
                ", listaTutor=" + listaTutor +
                ", listaVeterinario=" + listaVeterinario +
                ", listaAnimal=" + listaAnimal +
                '}';
    }

    public void addFuncAdm(FuncionarioAdministrativo adm){
        this.listaFuncionariosAdm.add(adm);
    }

    public void addTutor(Tutor t){
        this.listaTutor.add(t);
    }

    public void addVeterinario(Veterinario v){
        this.listaVeterinario.add(v);
    }

    public void addAnimal(Animal a){
        this.listaAnimal.add(a);
    }

    public void listarFuncionarios(){
        System.out.println("Funcionários: ");
        System.out.println(this.listaFuncionariosAdm);
    }

    public void listarTutor(){
        System.out.println("Tutores: ");
        System.out.println(this.listaTutor);
    }

    public void listarVeterinario(){
        System.out.println("Veterinários: ");
        System.out.println(this.listaVeterinario);
    }

    public void listarAnimal(){
        System.out.println("Animais");
        System.out.println(this.listaAnimal);
    }

    public Tutor encontrarTutor(String cpf){
        for (Tutor t: listaTutor) {
            if(t.getCpf().equals(cpf)){
                return t;
            }
        }
        return null;
    }
}
