import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor da primeira mão: ");
        int m1 = sc.nextInt();
        System.out.println("digite o valor da segunda mão:");
        int m2 = sc.nextInt();
        if ((m1+m2) % 2 == 0) {
            System.out.println("o numero e par");
        }else {
            System.out.println("o numero e impar");
        }
    }
}
/*Você sabe que o “par ou ímpar” é o modo tradicional de escolher algo pela sorte. Normalmente, as
duas pessoas usam apenas uma mão e escolhem o número de dedos que desejam. Você soma o
total de dedos e verifica se o número é ímpar ou par. Um número é par se a sua divisão inteira por
2 resta zero, um número é ímpar no caso contrário. Então, faça isso. Leia o número de dedos da
mão de cada jogador e diga se o resultado deu ímpar ou par*/