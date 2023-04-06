// Faça um Programa que leia três números e mostre o maior deles.
package Exercicios;
import java.util.Scanner;
public class Ex025 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, maiorN;

        System.out.println("Digite um número inteiro:");
        n1 = input.nextInt();
        System.out.println("Digite mais um número inteiro:");
        n2 = input.nextInt();
        System.out.println("Por fim, digite mais um número inteiro:");
        n3 = input.nextInt();

        maiorN = n1;
        if (n2 > maiorN){
            maiorN = n2;
        }
        if (n3 > maiorN){
            maiorN = n3;
        }

        System.out.println("O maior número digitado foi " + maiorN);
    }
}
