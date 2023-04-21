/* Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;
*/
package Exercicios;
import java.util.Scanner;
public class Ex034 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.println("Digite as medidas dos lados de um triângulo: \nInsira o valor do primeiro lado:");
        lado1 = input.nextInt();
        System.out.println("Insira o valor do segundo lado:");
        lado2 = input.nextInt();
        System.out.println("Insira o valor do terceiro lado:");
        lado3 = input.nextInt();

        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2){
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("Triângulo Equilátero.");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                System.out.println("Triângulo Escaleno.");
            }else {
                System.out.println("Triângulo Isósceles.");
            }
        } else {
            System.out.println("Os valores não podem formar um triângulo.");
        }
    }
}
