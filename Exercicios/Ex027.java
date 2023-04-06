// Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
package Exercicios;
import java.util.Scanner;
public class Ex027 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float preco1, preco2, preco3, melhorPreco;

        System.out.println("Insira o valor do primeiro produto:");
        preco1 = input.nextFloat();
        System.out.println("Insira o valor do segundo produto:");
        preco2 = input.nextFloat();
        System.out.println("Insira o valor do terceiro produto:");
        preco3 = input.nextFloat();

        if (preco1 < preco2 && preco1 < preco3){
            System.out.println("O primeiro produto é o que deve ser comprado.");
        } else if (preco2 < preco1 && preco2 < preco3){
            System.out.println("O segundo produto é o que deve ser comprado.");
        } else {
            System.out.println("O terceiro produto é o que deve ser comprado.");
        }

    }
}
