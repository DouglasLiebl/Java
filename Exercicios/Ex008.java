/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas
 trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/
package Exercicios;
import java.util.Scanner;
public class Ex008 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int horas;
        double salario, valorHora;

        System.out.println("Insira o valor que da hora trabalhada:");
        valorHora = input.nextDouble();
        System.out.println("Insira a quantidade de horas trabalhadas no mês:");
        horas =  input.nextInt();
        salario = valorHora * horas;
        System.out.println("O seu salário ao final do mês será R$ " + salario);

    }
}
