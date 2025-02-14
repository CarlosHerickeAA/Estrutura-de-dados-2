import java.util.Scanner;
import java.util.Random;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        System.out.print("Digite o numero máximo de rifas: ");
        int rifasmax = sc.nextInt();
        System.out.println("numero apostado pelo usuário");
        int numeroapostado = sc.nextInt();
        int numersorteado = gerador.nextInt(rifasmax) + 1;
        if (numeroapostado == numersorteado) { System.out.println("acertou!");
        } else {System.out.println("errou");}

    }
}
/*Chega de trabalhar com datas! Agora vamos trabalhar com números aleatórios.

Você está fazendo
um sistema de rifas.
 Você deve ler o número máximo da rifa
 , por exemplo: 30, 50, 100, assim
como o número da rifa apostado pelo usuário.
 Você deve fazer o sorteio e verificar se o número
que o usuário escolheu foi o sorteado.

Procure como gerar números aleatórios na internet.*/