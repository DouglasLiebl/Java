//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

package Exercicios;
import java.util.Scanner;
public class Ex015 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float metros, resto, totalLitros, preco;
        int latas;

        System.out.println("Insira a metragem a ser pintada:");
        metros = input.nextFloat();

        totalLitros = metros / 3;
        latas = (int)totalLitros / 18;
        resto = totalLitros % 18;
        if (resto > 0){
            latas += 1;
        }
        preco = latas * 80;

        System.out.println("- Latas necessárias: " + latas +"\n= Valor à pagar: R$ " + preco);
    }
}
