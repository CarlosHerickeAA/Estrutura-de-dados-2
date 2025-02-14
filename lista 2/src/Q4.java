import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota1,nota2,nota3;
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextFloat();
        if((nota1+nota2+nota3)/3>=7){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}
/*
* Na sua escola, você faz três avaliações no ano e a sua nota final é a média aritmética dessas três
avaliações. Para você ser aprovado sua média deve ser maior ou igual a 7.0 pontos, caso contrário
você estará reprovado. Faça um programa para ler suas notas e dizer se você está aprovado ou
reprovado.
* */