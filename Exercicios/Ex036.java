// Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
package Exercicios;
import java.util.Scanner;
public class Ex036 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ano;
        float resto;

        System.out.println("Insira um ano válido:");
        ano = input.nextInt();

        resto = ano % 4f;

        if (resto == 0){
            System.out.println("O ano inserido é bissexto.");
        } else {
            System.out.println("O ano inserido não é bissexto.");
        }

    }
}
