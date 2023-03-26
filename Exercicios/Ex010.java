// Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
package Exercicios;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Ex010 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat convert = new DecimalFormat("00.00");
        convert.setRoundingMode(RoundingMode.HALF_UP);

        double celcius, fahrenheit;
        System.out.println("Insira a temperatura, em Celcius:");
        celcius = input.nextDouble();
        fahrenheit = (celcius * (double)9 / 5) + 32;

        String fahrenheitArredondado = convert.format(fahrenheit);
        System.out.println("A temperatura, em Fahrenheit, é: " + fahrenheitArredondado);

    }
}
