/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
--Para homens: (72.7*h) - 58
--Para mulheres: (62.1*h) - 44.7
*/
package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex013 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat convert = new DecimalFormat("0.00");
        float altura, pesoHomem, pesoMulher;
        String pIhomem, pImulher;

        System.out.println("Digite a altura para calcular o peso ideal:");
        altura = input.nextFloat();

        pesoHomem = (72.7f * altura) - 58;
        pesoMulher = (62.1f * altura) - 44.7f;
        pIhomem = convert.format(pesoHomem);
        pImulher = convert.format(pesoMulher);

        System.out.println("O peso ideal pra homens de " + altura + " é " + pIhomem + " kgs \n" +
                "O peso ideal pra mulheres de "+ altura + " é " + pImulher + " kgs");

    }
}
