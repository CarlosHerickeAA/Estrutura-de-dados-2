import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um numero;");
        int num = sc.nextInt();
        System.out.println("Digite o sucessor do ultimo numero;");
        int num2 = sc.nextInt();
        int numsucessor = num + 1;
        if (num2 == num + 1) {
        System.out.println("essta correto!");
        } else {
            System.out.println("essta errado, o correto é: " + numsucessor);
        }
    }
}
/*
 Sofia tem oito anos, é está aprendendo os números, os antecessores e os sucessores. Você
  resolveu fazer um programa para ajudá-la a saber se um número é sucessor de outro. Você
  basicamente pede como entrada um número, depois o suposto sucessor, por fim exibe se o
  suposto sucessor é o sucessor mesmo. É tipo assim: Sofia insere os números: 23 e, depois, 24 e
  você vai exibir: “O número 24 é sucessor de 23”, mas se Sofia colocar 23 e, depois, 26, você deve
  exibir: “O número 26 não é sucessor de 23”
 */