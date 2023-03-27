// Faça um Programa que peça dois números e imprima o maior deles.
package Exercicios;
import java.util.Scanner;
public class Ex020 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro número inteiro:");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        n2 = input.nextInt();

        if (n1 > n2){
            System.out.println("O maior número digitado foi o primeiro.");
        } else if (n1 == n2){
            System.out.println("Os números digitados são iguais.");
        } else {
            System.out.println("O maior número digitado foi o segundo.");
        }
    }
}
