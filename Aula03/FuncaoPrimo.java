package Aula03;

import java.util.Scanner;

public class FuncaoPrimo {

    public static boolean ehPrimo(int n){

        boolean primo = true;

        for(int i=2; i <n; i++){
            if(n%i==0){
                primo = false;
            }
        } return primo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
       int numeroDesejado = scanner.nextInt();
       int numeroEncontrado= 0;
       int numeroTeste = 2;

       while (numeroEncontrado<numeroDesejado){
           if(ehPrimo(numeroTeste)){
               System.out.print(numeroTeste + ", ");
               numeroEncontrado++;
           }
           numeroTeste++;
       }


    }
}
