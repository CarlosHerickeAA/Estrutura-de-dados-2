import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        System.out.println("Digite o mês:");
        int mes = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mês errado");
            return;
        }

        System.out.println("Digite o dia:");
        int dia = sc.nextInt();

        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 1 || dia > 31)) {
            System.out.println("Dia errado");
            return;
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
            System.out.println("Dia errado");
            return;
        }

        if (mes == 2) {
            if ((bissexto && (dia < 1 || dia > 29)) || (!bissexto && (dia < 1 || dia > 28))) {
                System.out.println("Dia errado");
                return;
            }
        }

        System.out.println("Data válida");
    }
}
/*Parabéns! Esse é o seu primeiro dia no estágio na rede de hotéis: DOM. O seu supervisor de
estágio passou uma demanda que eles estão tendo em produção. As datas não estão sendo
validadas corretamente pela função da API, então, ele resolveu pedir a você que desenvolvesse
um programa que validasse a data. Você deve ler o dia, o mês e o ano e ao fim imprimir se a data é
válida ou não. Não esqueça de verificar se o ano é bissexto ou não (se for bissexto, o mês de
fevereiro terá 29 dias).*/