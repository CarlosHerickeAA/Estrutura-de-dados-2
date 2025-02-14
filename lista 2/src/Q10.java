import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra = sc.next().charAt(0);
        if (Character.toUpperCase(letra) == 'A' || Character.toUpperCase(letra) == 'E' || Character.toUpperCase(letra) == 'I' || Character.toUpperCase(letra) == 'O' || Character.toUpperCase(letra) == 'U') {
            System.out.println("e uma vogal");
        }else {
            System.out.println("e uma consoante");
        }
    }
}
/*A minha sobrinha está aprendendo as letras do alfabeto. Ela ainda confunde o que é vogal e
consoante. Você topou fazer comigo um programa que verifica se uma letra é vogal ou consoante.
Então, é isso, né? Vamos lá?*/