import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia : ");
        int d = sc.nextInt();
        System.out.println("Digite o mes : ");
        int m = sc.nextInt();
        if ((m == 3 && d >= 20) || (m > 3 && m < 6) || (m == 6 && d <= 21)) {
            System.out.println("está na outono");
        }else if ((m == 9 && d >= 22) || (m > 9 && m < 12) || (m == 12 && d <= 21)) {
            System.out.println("está na primavera");
        }else {
            System.out.println("não e nem primavera nem o outono");
        }
    }
}
/*Esse desafio vai exigir de você um pouco de curiosidade, eu já lhe aviso. Como eu sou generoso,
vou lhe deixar uma dica aqui. Bem, nesse desafio, você deve informar se a data do dia faz parte
da primavera ou do outono. Um dia está na primavera se estiver entre 22/09 à 21/12 e o outono de
datas entre 20/03 à 21/06*/