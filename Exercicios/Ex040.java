/* Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
*/
package Exercicios;
import java.util.Scanner;
public class Ex040 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int valor, nota100, nota50, nota10, nota5, nota1;
        int resto100, resto50, resto10;

        System.out.println("Insira o valor que deseja sacar:");
        valor = input.nextInt();

        if (valor < 10 || valor > 600){
            System.out.println("Valor de saque inválido. \nInsira um novo valor acima de R$ 10,00 e até R$ 600:");
            valor = input.nextInt();
        }

        nota100 = valor / 100;
        resto100 = valor % 100;
        nota50 = resto100 / 50;
        resto50 = resto100 % 50;
        nota10 = resto50 / 10;
        resto10 = resto50 % 10;
        nota5 = resto10 / 5;
        nota1 = resto10 % 5;

        if (nota100 == 1){
            System.out.println("1 nota de R$ 100,00");
        } else if (nota100 > 1){
            System.out.println(nota100 + " notas de R$ 100,00");
        }

        if (nota50 == 1){
            System.out.println("1 nota de R$ 50,00");
        } else if (nota50 > 1){
            System.out.println(nota50 + " notas de R$ 50,00");
        }

        if (nota10 == 1){
            System.out.println("1 nota de R$ 10,00");
        } else if (nota10 > 1){
            System.out.println(nota10 + " notas de R$ 10,00");
        }

        if (nota5 == 1){
            System.out.println("1 nota de R$ 5,00");
        } else if (nota5 > 1){
            System.out.println(nota5 + " notas de R$ 5,00");
        }

        if (nota1 == 1){
            System.out.println("1 nota de R$ 1,00");
        } else if (nota1 > 1){
            System.out.println(nota1 + " nota de R$ 1,00");
        }
    }
}
