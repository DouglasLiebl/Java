// Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
package Exercicios;
import java.util.Scanner;
public class Ex037 {
    public static void main(String[] args){
        Scanner input = new  Scanner(System.in);
        int dia, mes, ano;
        boolean validacao = false;

        System.out.println("Insira um dia:");
        dia = input.nextInt();
        System.out.println("Insira um mês:");
        mes = input.nextInt();
        System.out.println("Insira um ano:");
        ano = input.nextInt();

        switch (mes){
            case 2:
                if (dia <= 28){
                    validacao = true;
                } else if (dia == 29){
                    if (ano % 4 == 0){
                        validacao = true;
                    }
                }
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia <= 31 && ano > 0){
                    validacao = true;
                }
                break;
            case 4, 6, 9, 11:
                if (dia <= 30 && ano > 0){
                    validacao = true;
                }
                break;
            default:
                validacao = false;

        }

        if (validacao){
            System.out.println("A data inserida é válida!");
        } else {
            System.out.println("A data inserida é inválida!");
        }
    }
}
