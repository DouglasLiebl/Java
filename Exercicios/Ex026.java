// Faça um Programa que leia três números e mostre o maior e o menor deles.
package Exercicios;
import java.util.Scanner;
public class Ex026 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, maiorN, menorN;

        System.out.println("Insira o primeiro número inteiro:");
        n1 = input.nextInt();
        System.out.println("Insira o segundo número inteiro:");
        n2 = input.nextInt();
        System.out.println("Insira o terceiro número inteiro:");
        n3 = input.nextInt();

        maiorN = n1;
        menorN = n1;

        if (n2 > maiorN){
            maiorN = n2;
        }
        if (n3 > maiorN){
            maiorN = n3;
        }

        if (n2 < menorN){
            menorN = n2;
        }
        if (n3 < menorN){
            menorN = n3;
        }

        System.out.println("O maior número digitado foi " + maiorN + " e o menor foi " + menorN);

    }
}
