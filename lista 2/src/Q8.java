import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor do dado do adversário: ");
        int adv = sc.nextInt();
        System.out.println("digite o valor do seu dado: ");
        int jog = sc.nextInt();
        if (adv == jog) {System.out.println("deu empate");}
        else if (adv > jog) {System.out.println("é a vez do adversário");}
        else{System.out.println("é a sua vez");}
    }
}
/*
Em um jogo de tabuleiro, um jogador pode movimentar uma peça apenas se o número do seu
dado for maior que o do seu adversário. Faça um programa que informe se o jogador pode ou não
jogar aquela partida. Leia o número do dado do jogador e do seu adversário e informe quem deve
jogar. No caso de empate, nenhum dos jogadores joga
*/