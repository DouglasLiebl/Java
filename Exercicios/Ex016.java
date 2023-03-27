// João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

package Exercicios;
import java.util.Scanner;
public class Ex016 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float peso, excesso, multa;

        System.out.println("Insira o peso dos peixes:");
        peso = input.nextFloat();

        excesso = peso - 50;

        if (excesso > 0){
            multa = excesso * 4.00f;
            System.out.println("A multa que deverá ser paga é de R$ " + multa);
        } else {
            System.out.println("Este peso não irá gerar multa por excesso");
        }

    }
}
