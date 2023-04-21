/* Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
  Média de Aproveitamento  Conceito
  Entre 9.0 e 10,0        A
  Entre 7.5 e 9,0         B
  Entre 6.0 e 7,5         C
  Entre 4.0 e 6,0         D
  Entre 4.0 e zero        E
* */
package Exercicios;
import java.util.Scanner;
public class Ex033 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float n1, n2, media;

        System.out.println("Insira a primeira nota:");
        n1 = input.nextFloat();
        System.out.println("Insira a segunda nota:");
        n2 = input.nextFloat();

        media = (n1 + n2) / 2f;

        if (media <= 4){
            System.out.println("Classificação: E.");
        } else if (media > 4 && media <= 6){
            System.out.println("Classificação: D.");
        } else if (media > 6 && media <= 7.5f){
            System.out.println("Classificação: C.");
        } else if (media > 7.5f && media <= 9){
            System.out.println("Classificação: B.");
        } else if (media > 9 && media <= 10){
            System.out.println("Classificação: A.");
        }
    }
}
