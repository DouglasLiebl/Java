// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
package Exercicios;
import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double area, raio;

        System.out.println("Insira o raio de um determinado círculo:");
        raio = input.nextDouble();
        area = 3.14 * Math.pow(raio, 2);
        System.out.println("A área do circulo é de " + area + " centímetros quadrados.");

    }
}
