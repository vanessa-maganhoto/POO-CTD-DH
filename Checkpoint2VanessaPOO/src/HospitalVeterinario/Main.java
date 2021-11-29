package HospitalVeterinario;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HospitalVeterinario hospitalVeterinario = new HospitalVeterinario();

        /*CÓDIGO A SEGUIR É PARA INSERIR OS DADOS COM SCANNER*/

        int pergunta = -1;

        while (pergunta != 0) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("O que deseja cadastrar: \n" +
                    "1- Funcionário Administrativo, \n" +
                    "2- Veterinário(a),\n" +
                    "3- Tutor, \n" +
                    "4- Animal, \n" +
                    "5- Listar funcionários administrativo, \n" +
                    "6- Listar veterinários, \n" +
                    "7- Listar tutor, \n" +
                    "8- Listar animais, \n" +
                    "9- Encontrar tutor por CPF, \n" +
                    "0- SAIR");
            pergunta = entrada.nextInt();

            switch (pergunta ){
                case 1:
                    FuncionarioAdministrativo funcionarioAdministrativo = cadastrarFuncionarioAdministrativo(entrada);
                    hospitalVeterinario.addFuncAdm(funcionarioAdministrativo);
                    break;

                case 2:
                    Veterinario veterinario = cadastrarVeterinario(entrada);
                    hospitalVeterinario.addVeterinario(veterinario);
                    break;

                case 3:
                    Tutor tutor = cadastrarTutor(entrada);
                    hospitalVeterinario.addTutor(tutor);
                    break;

                case 4:
                    Animal animal = cadastrarAnimal(entrada);
                    hospitalVeterinario.addAnimal(animal);
                    break;

                case 5:
                    hospitalVeterinario.listarFuncionarios();
                    break;

                case 6:
                    hospitalVeterinario.listarVeterinario();
                    break;

                case 7:
                    hospitalVeterinario.listarTutor();
                    break;

                case 8:
                    hospitalVeterinario.listarAnimal();
                    break;

                case 9:
                    System.out.println("Informe o CPF ");
                    String cpf = entrada.next();
                    Tutor t = hospitalVeterinario.encontrarTutor(cpf);
                    System.out.println(t == null ? "Não encontrado" : t);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        System.out.println("Cadastro encerrado!");
    }

    private static FuncionarioAdministrativo cadastrarFuncionarioAdministrativo(Scanner entrada) {
        System.out.println("Nome completo do funcionário: ");
        String nomeCompleto = entrada.next();

        System.out.println("Data de nascimento no formato AAAA-MM-DD: ");
        String dataNasc = entrada.next();
        LocalDate dn = LocalDate.parse(dataNasc);

        System.out.println("Endereço: ");
        String endereco = entrada.next();

        System.out.println("Telefone para contato: ");
        int telCont = entrada.nextInt();

        System.out.println("RG: ");
        String rg = entrada.next();

        System.out.println("CPF: ");
        String cpf = entrada.next();

        System.out.println("Caminho da pasta onde a foto está armazenada: ");
        String foto = entrada.next();

        System.out.println("Data do primeiro dia de trabalho no formato AAAA-MM-DD: ");
        String dataInicio = entrada.next();
        LocalDate di = LocalDate.parse(dataInicio);

        System.out.println("Salário: ");
        double salario = entrada.nextDouble();

        System.out.println("Cargo: ");
        String cargo = entrada.next();

        System.out.println("Carga horária mensal: ");
        int cargaHmensal = entrada.nextInt();

        FuncionarioAdministrativo fn = new FuncionarioAdministrativo(nomeCompleto, dn, endereco, telCont, rg, cpf, foto, di, salario, cargo, cargaHmensal);
        return fn;
    }

    private static Veterinario cadastrarVeterinario(Scanner entrada) {

        System.out.println("Nome completo do funcionário: ");
        String nomeCompleto = entrada.next();

        System.out.println("Data de nascimento no formato AAAA-MM-DD: ");
        String dataNasc = entrada.next();
        LocalDate dn = LocalDate.parse(dataNasc);

        System.out.println("Endereço: ");
        String endereco = entrada.next();

        System.out.println("Telefone para contato: ");
        int telCont = entrada.nextInt();

        System.out.println("RG: ");
        String rg = entrada.next();

        System.out.println("CPF: ");
        String cpf = entrada.next();

        System.out.println("Caminho da pasta onde a foto está armazenada: ");
        String foto = entrada.next();

        System.out.println("Data do primeiro dia de trabalho no formato AAAA-MM-DD: ");
        String dataInicio = entrada.next();
        LocalDate di = LocalDate.parse(dataInicio);

        System.out.println("Número do conselho: ");
        String conselho = entrada.next();

        System.out.println("Realiza cirurgia: ");
        Boolean realizaCirurgia = entrada.nextBoolean();


        System.out.println("Dias de plantão: (Inserir os dados separados por , ");
        String p = entrada.nextLine();
        String[] diasPlantao = p.split(",");

        System.out.println("Salário: ");
        double valorPlantao = entrada.nextDouble();

        System.out.println("Especialidade: ");
        String especialidade = entrada.next();
        Veterinario v = new Veterinario(nomeCompleto, dn, endereco, telCont, rg, cpf, foto, di, conselho, realizaCirurgia, diasPlantao, valorPlantao, especialidade);
        return v;
    }

    private static Tutor cadastrarTutor(Scanner entrada) {

        System.out.println("Nome completo do tutor: ");
        String nomeCompleto = entrada.next();

        System.out.println("Data de nascimento no formato AAAA-MM-DD: ");
        String dataNasc = entrada.next();
        LocalDate dn = LocalDate.parse(dataNasc);

        System.out.println("Endereço: ");
        String endereco = entrada.next();

        System.out.println("Telefone para contato: ");
        int telCont = entrada.nextInt();

        System.out.println("RG: ");
        String rg = entrada.next();

        System.out.println("CPF: ");
        String cpf = entrada.next();

        System.out.println("Caminho da pasta onde a foto está armazenada: ");
        String foto = entrada.next();

        System.out.println("Data do primeiro dia de atendimento no formato AAAA-MM-DD: ");
        String dataInicio = entrada.next();
        LocalDate di = LocalDate.parse(dataInicio);

        Tutor t = new Tutor(nomeCompleto, dn, endereco, telCont, rg, cpf, foto, di);
        return t;
    }

    private static Animal cadastrarAnimal(Scanner entrada) {

        System.out.println("Nome completo do tutor: ");
        String nomeCompleto = entrada.next();

        System.out.println("Insira o nome do tutor do animal: ");
        Tutor t = cadastrarTutor(entrada);

        System.out.println("Categoria do animal: ");
        String categoria = entrada.next();

        System.out.println("Porte do animal: ");
        String porte = entrada.next();

        System.out.println("Características do animal: ");
        String caracteristicas = entrada.next();

        System.out.println("Caminho da pasta onde a foto está armazenada: ");
        String foto = entrada.next();

        System.out.println("Número do prontuário: ");
        int prontuario = entrada.nextInt();

        System.out.println("Peso aproximado do animal: ");
        double peso = entrada.nextDouble();

        System.out.println("Data de nascimento no formato AAAA-MM-DD: ");
        String dataNasc = entrada.next();
        LocalDate dn = LocalDate.parse(dataNasc);
        Animal a = new Animal(nomeCompleto, t, categoria, porte, caracteristicas, foto, prontuario, peso, dn);
        return a;
    }

}

/* CÓDIGO ABAIXO SERVE PARA TESTE
        Tutor vanessa = new Tutor("Vanessa", LocalDate.parse("2000-05-10"),"rua do glicerio",321321,"141514", "1562405", "fffff", LocalDate.parse("2021-05-05"));

        Tutor Mariana = new Tutor("Mariana",LocalDate.parse("1996-06-03"),"Rua do lavapés, 301", 987573265, "12456789","08865414721","rsrsrsr",LocalDate.parse("2021-02-11"));

        Animal ricoto = new Animal("Ricoto",vanessa,"canino","medio","muito lindão", "hahahaha", 1313,16,LocalDate.parse("2019-03-03"));
        Animal ricota = new Animal("Ricota",Mariana, "canino", "medio", "muito dócil", "soufashin/br", 132587,23.5, LocalDate.parse("2021-02-11"));


        String[] plantaoMarcio = new String[]{"segunda", "quarta"};
        String[] plantaoTeresa = new String[] {"quinta", "sábado"};
        Veterinario marcio = new Veterinario("Marcio Silva", LocalDate.parse("1990-10-10"),"rua xyz",985846352,"16852741","45612396320","ofluxo.br",LocalDate.parse("2021-05-16"), "15784203",true,plantaoMarcio,300,"geral");
        Veterinario teresa = new Veterinario("Teresa Matias", LocalDate.parse("2000-12-12"),"rua dadafa", 965371023, "56489730", "45630274390", "ofluxoeaqui.br", LocalDate.parse("2019-05-08"),"45168950", false, plantaoTeresa, 240, "neuro");

        FuncionarioAdministrativo barbara = new FuncionarioAdministrativo("Barbara Mendes",LocalDate.parse("1997-10-10"),"avenida xyz", 985632014, "15852789", "45630015690", "kkkk",LocalDate.parse("2017-05-10"), 1800, "recepcionista", 180);
        FuncionarioAdministrativo manoel = new FuncionarioAdministrativo("Manoel Dantas", LocalDate.parse("1987-12-30"),"alameda zpto",50604523, "85654201","78950049630","okokokok", LocalDate.parse("2001-06-28"), 2000, "porteiro", 180);

        Mariana.addAnimal(ricota);
        vanessa.addAnimal(ricoto);
        //System.out.println(vanessa);
        // System.out.println(Mariana);

        //teresa.examinar(ricoto); TUDO OK
        //teresa.prescreverRemedio(ricoto); TUDO OK
        //teresa.emitirOrientacoes(ricoto); TUDO OK
        //teresa.pedirExames(ricoto); // mudar a ordem dos metodos para fazer sentido TUDO OK

        // barbara.abrirFicha(ricota, marcio); TUDO OK
        //barbara.receberPagamento(ricota, marcio); TUDO OK
        barbara.encerrarAtendimento(ricota, marcio);

        Gerenciamento relatorioDia1 = new Gerenciamento();

        /*relatorioDia1.addAnimalLista(ricota);
        relatorioDia1.addAnimalLista(ricoto);
        relatorioDia1.addTutor(vanessa);
        relatorioDia1.addTutor(Mariana);
        relatorioDia1.addVeterinario(marcio);
        relatorioDia1.addVeterinario(teresa);
        relatorioDia1.addFuncAdm(barbara);
        relatorioDia1.addFuncAdm(manoel);

        System.out.println(relatorioDia1);*/
