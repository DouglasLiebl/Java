// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
package Exercicios;
import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double n1, n2, n3, n4, media;

        System.out.println("Insira a primeira nota:");
        n1 = input.nextDouble();
        System.out.println("Insira a segunda nota:");
        n2 = input.nextDouble();
        System.out.println("Insira a terceira nota:");
        n3 = input.nextDouble();
        System.out.println("Insira a quarta nota:");
        n4 = input.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A nota média do aluno é: " + media);
    }
}
