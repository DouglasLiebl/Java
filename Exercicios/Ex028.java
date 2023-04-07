//Faça um Programa que leia três números e mostre-os em ordem decrescente.
package Exercicios;
import java.util.Scanner;
public class Ex028 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, c, aux;

        System.out.println("Insira três números inteiros. \nInsira o primeiro números:");
        a = input.nextInt();
        System.out.println("Insira o segundo número:");
        b = input.nextInt();
        System.out.println("Insira o terceiro número:");
        c = input.nextInt();

        if (a < c){
            aux = a;
            a = c;
            c = aux;
        }
        if (b < c){
            aux = b;
            b = c;
            c = aux;
        }
        if (a < b){
            aux = a;
            a = b;
            b = aux;
        }

        System.out.println("Números digitados, em ordem decrescente: " + a + " " + b + " " + c);

    }
}
