    import java.util.Scanner;

    public class Q9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número de 1 a 13: ");
            int numero = sc.nextInt();
            String carta = "";
            if (numero > 0 && numero <= 13) {
                String[] numerosPorExtenso = {
                    "Ás","Dois", "Três", "Quatro", "Cinco", "Seis",
                    "Sete", "Oito", "Nove", "Dez","Valete","Rainha","Rei"
            };
                carta=numerosPorExtenso[numero-1];
            }else {
                System.out.println("Erro");
            }
            System.out.println("A carta é: " + carta);
        }
    }
/*Um baralho contém 52 cartas de 4 tipos (naipes) diferentes: paus, espadas, copas e ouro. Em cada
naipe, que consiste de 13 cartas, 3 dessas cartas contêm as figuras do rei, da dama e do valete,
respectivamente. Faça um programa que leia um número de 1 a 13 e informe qual carta o número
representa por extenso. Lembrando que temos algumas cartas especiais: 1 (Ás), 11 (Jalete), 12
(Rainha), 13 (Rei).*/