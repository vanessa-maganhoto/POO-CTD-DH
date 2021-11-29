package Aula12;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("João", "Vitor", "00012056390",
                "joao@dh.com", "000123", 2000, 100);

        Empresa dh = new Empresa("DH", "555");
        dh.addFuncionario(funcionario);

    }
}
