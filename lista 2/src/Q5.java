import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ingresso = 100;
        double A = (ingresso * 0.7);
        double B = (ingresso * 0.5);
        System.out.print("que hora são; ");
        int hora = sc.nextInt();
        System.out.println("Qual o seu gênero? (m para masculino, f para feminino): ");
        String genero = sc.next();
        if(genero.equals("m")) {
            if(hora < 22) {
                System.out.println("o valor do ingresso é  "+A);
            }else {
                System.out.println("o valor do ingresso é  "+ingresso);
            }

        }else if(genero.equals("f")) {
            if(hora < 22) {
                System.out.println("o valor é grátis ");
            }else {
                System.out.println("o valor do ingresso é  "+B);}
        }else {
            System.out.println("gênero invalido");
        }
    }
}
/*
The Asa’s Club é um clube da cidade e você está trabalhando na portaria dela. As regras para
comprar ingressos para o clube são claramente machistas, mas elas são aplicadas. As mulheres
que chegarem até as 22h não pagam a entrada, mas depois desse horário, elas pagam metade do
valor do ingresso. Os homens que chegarem até as 22h pagam 70% do ingresso, enquanto depois
desse horário pagam o valor integral. Você que não perdeu tempo, fez um programa para a
portaria. Eu fico me perguntando porque tu se mete nessas coisas sem ganhar um centavo, mas
tudo bem
*/