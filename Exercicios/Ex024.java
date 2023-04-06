/*Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.
*/
package Exercicios;
import java.util.Scanner;
public class Ex024 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float nota1, nota2, media;

        System.out.println("Insira a primeira nota:");
        nota1 = input.nextFloat();
        System.out.println("Insira a segunda nota:");
        nota2 = input.nextFloat();

        media = (nota1 + nota2) / 2;

        if (media == 10f){
            System.out.println("Aprovado com Distinção.");
        } else if (media >= 7f && media < 10f){
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
