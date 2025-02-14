import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor total da compra:");
        double total = sc.nextDouble();
        if (total < 50) {
            double total50 = total * 0.95;
            System.out.println("o total da compra com desconto é de: R$" + total50);
        }else if (total < 100) {
            double total100 = total * 0.90;
            System.out.println("o total da compra com desconto é de: R$" + total100);
        }else if (total < 200) {
            double total200 = total * 0.80;
            System.out.println("o total da compra com desconto é de: R$" + total200);
        }else if (total < 500) {
            double total500 = total * 0.75;
            System.out.println("o total da compra com desconto é de: R$" + total500);
        }else {
            double total501 = total * 0.70;
            System.out.println("o total da compra com desconto é de: R$" + total501);
        }
    }
}
/*
* Dessa vez, lhe iludiram e disseram que iam pagar para você fazer um programa, mas no fundo
você sabe que não vai receber. Você foi contratado para criar um programa de promoção do dia
1
do consumidor. Basicamente, você vai ler o total da compra de um consumidor e aplicar o
desconto conforme abaixo:
total compra desconto
< 50,00 5%
< 100,00 10%
< 200,00 20%
< 500,00 25%
>= 500, 00 30%
Por fim, você deve imprimir o valor total da compra após o desconto
* */