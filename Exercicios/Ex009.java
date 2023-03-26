/* Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9). */
package Exercicios;
import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex009 {
    public static void main(String[] args){
        DecimalFormat convert = new DecimalFormat("00.00");
        convert.setRoundingMode(RoundingMode.HALF_UP);
        Scanner input = new Scanner(System.in);
        double fahrenheit, celcius;

        System.out.println("Digite a temperatura, em Fahrenheit:");
        fahrenheit = input.nextDouble();
        celcius = 5 * ((fahrenheit - 32) / 9);

        String celciusArredondado = convert.format(celcius);
        System.out.println("A temperatura, em Celcius, é: " + celciusArredondado);

    }
}
