/* Faça um Programa que calcule a área de um quadrado,
 em seguida mostre o dobro desta área para o usuário.
 */
package Exercicios;
import java.util.Scanner;
public class Ex007 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double lado, area, dobro;

        System.out.println("Digite a medida do lado de um quadrado:");
        lado = input.nextDouble();
        area = lado * lado;
        dobro = area * 2;
        System.out.println("A área de um quadrado de lado " + lado + " é " + area + " m² e o dobro da área é " +
                dobro + " m²");
    }
}
