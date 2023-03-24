// Faça um Programa que peça dois números e imprima a soma.
package Exercicios;
import java.util.Scanner;
public class Ex003{
    public static void main(String[] args){
        int n1, n2, soma;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        n1 = input.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = input.nextInt();
        soma = n1 + n2;
        System.out.println("A soma dos dois números digitados é: " + soma);
    }
}
