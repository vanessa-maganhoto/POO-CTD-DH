package Aula02;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = numero.nextInt();

        int controle =0;

        for(int i=2; i < n; i++){
            if(n%2==0)
                controle++;
        }
        if(controle==0){
            System.out.println("Número primo");
        } else{
            System.out.println("Número não é primo");
        }

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = entrada.nextInt();

    }

    int eMaior(int n1, int n2, int n3){
        if(n1>n2 && n1>n3){
            return n1;
        } else if ( n2>n3 && n2>n1){
            return n2;
        } else{
            return n3;
        }
    }
}
