/* Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a1-- o produto do dobro do primeiro com metade do segundo .
a2-- a soma do triplo do primeiro com o terceiro.
a3-- o terceiro elevado ao cubo.
*/

package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex011 {
    public static void main(String[] args){
        DecimalFormat convert = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        int n1, n2, a1;
        double n3, a2, a3;

        System.out.println("Insira o primeiro número inteiro:");
        n1 = input.nextInt();
        System.out.println("Insira o segundo número inteiro:");
        n2 = input.nextInt();
        System.out.println("Por fim, insira um número real:");
        n3 = input.nextDouble();

        a1 = (n1 * 2) * (n2 / 2);
        a2 = (n1 * 3) + n3;
        a3 = Math.pow(n3, 3);
        String a3comMenosCasas = convert.format(a3);

        System.out.println("O produto do dobro do primeiro inteiro com metade do segundo é: " + a1);
        System.out.println("A soma do triplo do primeiro inteiro com o número real é: " + a2);
        System.out.println("O número real ao cubo é: " + a3comMenosCasas);

    }

}
