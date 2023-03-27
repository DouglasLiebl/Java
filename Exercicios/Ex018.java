/*
Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 */
package Exercicios;
import java.util.Scanner;
public class Ex018 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int latas, galoes, latasM, galoesM;
        float metros, litros, resto, preco;

        System.out.println("Insira a metragem total:");
        metros = input.nextFloat();
        litros = metros / 6;
        int litrosArredondados = (int) Math.round((float)litros + 0.5f);
        System.out.println("Total de litros necessários: " + litrosArredondados);

        // Apenas latas.
        latas = (int)litros / 18;
        resto = (int)litros % 18;
        if (resto > 0){
            latas += 1;
        }
        preco = latas * 80.00f;
        System.out.println("Apenas latas de 18 litros: " + latas + "\nPreço total apenas latas: R$ " + preco);

        // Apenas galões.
        galoes = ((int)(litros / 3.6f));
        resto = (litros % 3.6f);
        if (resto > 0){
            galoes += 1;
        }
        preco = galoes * 25.00f;
        System.out.println("Apenas galões de 3,6 litros: " + galoes + "\nPreço total apenas galões: R$ " + preco);

        // Latas e galões.
        litros = litros * 1.10f;
        litrosArredondados = (int) Math.round((float)litros + 0.5f);
        latasM = (int)litros / 18;
        resto = (litros % 18);
        if (resto > 0 && resto > 3.6){
            galoesM = (int)(resto / 3.6);
            if ((resto % 3.6) > 0){
                galoesM += 1;
            }
        } else {
            galoesM = +1;
        }
        preco = (latasM * 80.00f) + (galoesM * 25.00f);
        System.out.println("Latas e Galões: \nLatas: " + latasM + "\nGalões: " + galoesM + "\nPreço total latas e galões: R$ " + preco);

    }
}
