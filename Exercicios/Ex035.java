/* Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
*/
package Exercicios;
import java.util.Scanner;
public class Ex035 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float a, b, c, delta, raiz1, raiz2;

        System.out.println("Insira o valor de A:");
        a = input.nextFloat();
        if (a == 0f){
            System.out.println("A equação não é do segundo grau. O programa não pode continuar.");
            System.exit(0);
        }

        System.out.println("Insira o valor de B:");
        b = input.nextFloat();
        System.out.println("Por fim, insira o valor de C:");
        c = input.nextFloat();

        delta = (b * b) + (4 * a * c);
        raiz1 = (-b + (delta * 1/2)) / 2 * a;
        raiz2 = (-b - (delta * 1/2)) / 2 * a;

        if (delta < 0f){
            System.out.println("A equação não possui raízes reais.");
        }
        if (delta == 0f) {
            System.out.println("A raiz da equação é " + raiz1);
        }

    }


}
