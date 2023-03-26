// Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex012 {
    public static void main(String[] args){
        DecimalFormat convert = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        float altura, peso;
        String pesoIdeal;

        System.out.println("Insira a sua altura:");
        altura = input.nextFloat();

        peso = (72.7f * altura) - 58;
        pesoIdeal = convert.format(peso);
        System.out.println("O seu peso ideal é " + pesoIdeal + " kgs");

    }
}
