// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
package Exercicios;
import java.util.Scanner;
public class Ex021 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double numero;

        System.out.println("Digite um número real:");
        numero = input.nextDouble();

        if (numero < 0){
            System.out.println("O número digitado é negativo");
        } else {
            System.out.println("O número digitado é positivo");
        }
    }
}
