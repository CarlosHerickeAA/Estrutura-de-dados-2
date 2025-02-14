import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nível de cinza (entre 0 e 255):");
        int cor = sc.nextInt();
        if(cor >= 0 && cor < 256) {
            if (cor < 128) {
                System.out.print("esta cor é escura");
            } else {
                System.out.print("esta cor é clara");
            }
        }else {
            System.out.println("este nivel não e valido");
        }
    }
}
/*
As cores no computador podem ser representadas por número inteiros entre 0 e 255, ou seja, 256
        valores distintos, onde 0 (zero) representa preto e 255 representa branco. Nessa escala de cinza,
os valores abaixo de 128 são os mais escuros, acima desse valor os mais claros. Faça um programa
que leia o nível de cinza, verifique se o valor está entre 0 e 255 e depois diga se é tom escuro ou
claro.
*/