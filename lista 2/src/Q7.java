import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double soma = 0.0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o preço " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            soma += precos[i];
        }
        double media = soma / 5;
        System.out.printf("\nA média dos preços é: R$ %.2f%n", media);
        System.out.println("Preços acima da média:");
        for (double preco : precos) {
            if (preco > media) {
                System.out.printf("R$ %.2f%n", preco);
            }
        }
    }
}
/*
* Você agora quer fazer um programa apenas para exercitar a sua lógica. Basicamente, você viu que
o IBGE faz uma consulta de 5 preços para ver a média de preços. Você resolveu fazer o seguinte:
ler os valores, calcular a média e verificar quais valores estão acima da média
* */