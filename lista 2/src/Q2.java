import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tminima = 17;
        System.out.println("digite a temperatura atual:");
        int T = sc.nextInt();
        if (T < Tminima){
            System.out.println("Frio da moléstia");
        }else{
            System.out.println("Tudo normal nas terras de Cuçumarim");
            }
        }
    }
/*
*Você viu na televisão que esse inverno vai ser rigoroso no Brasil. Decidiu então que vai monitorar a
temperatura da sua cidade. Se as temperaturas estiverem abaixo de 17ºC, você vai exibir na tela:
“Frio da moléstia", mas caso contrário: “Tudo normal nas terras de Cuçumarim”.
*/