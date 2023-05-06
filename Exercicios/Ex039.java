/* Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10.
*/
package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex039 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat f  = new DecimalFormat(".00");
        float n1, n2, n3, media;
        String mediaR;

        System.out.println("Insira a primeira nota:");
        n1 = input.nextFloat();
        System.out.println("Insira a segunda nota:");
        n2 = input.nextFloat();
        System.out.println("Insira a terceira nota:");
        n3 = input.nextFloat();

        media = (n1 + n2 + n3) / 3f;
        mediaR = f.format(media);

        if (media == 10f){
            System.out.println("Aprovado com Distinção!");
        } else if (media > 7f && media < 10f){
            System.out.println("Aprovado \nMédia: " + mediaR);
        } else {
            System.out.println("Reprovado \nMédia: " + mediaR);
        }
    }
}
