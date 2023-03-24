// Faça um Programa que converta metros para centímetros.
package Exercicios;
import java.util.Scanner;
public class Ex005 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double metro, centimetro;

        System.out.println("Insira um valor, em metros:");
        metro = input.nextDouble();
        centimetro = metro * 100;
        System.out.println(metro + " metros são equivalentes à " + centimetro + " centímetros.");

    }
}
