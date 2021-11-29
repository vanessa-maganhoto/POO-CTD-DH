package Aula03;

import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String jogadorA, jogadorB, maoA, maoB;
        int pontosA =0, pontosB = 0;
        System.out.println("Informe o nome do primeiro jogador: ");
        jogadorA = scanner.nextLine();
        System.out.println("Informe o nome do segundo jogador: ");
        jogadorB = scanner.nextLine();
        System.out.println("Digite 0 para pedra, 1 para papel e 2 para tesoura");

        do {
            System.out.print("Qual a sua jogada jogador A?  ");
            maoA =  scanner.nextLine();

            System.out.print("Qual a sua jogada jogador B?  ");
            maoB =  scanner.nextLine();

            if(maoA.equals("*") || maoB.equals("*")){
                break;
            }

            switch (whichWin(maoA, maoB)){
                case 1:
                    pontosA++;
                    System.out.println("Jogador " + jogadorA + " venceu");
                    break;

                case 2:
                    pontosB++;
                    System.out.println("Jogador " + jogadorB + " venceu");
                    break;

                case 0:
                    System.out.println("Empatou");
            }

        } while (true);
        System.out.println("FIM");

        System.out.println("O jogador " + jogadorA + " fez " + pontosA + " pontos");
        System.out.println("O jogador " + jogadorB + " fez " + pontosB + " pontos");
    }

    public static int whichWin(String maoA, String maoB){
        int valorMaoA = Integer.parseInt(maoA);
        int valorMaoB = Integer.parseInt(maoB);
        int resultado = valorMaoA - valorMaoB;
        switch (resultado){
            case 1:
            case -2:
                return 1;

            case 2:
            case -1:
                return 2;
            default:
               return 0;
        }

    }
}

// pedra papel tesoura
// 0 1 2