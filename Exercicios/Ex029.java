// Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
package Exercicios;
import java.util.Scanner;
public class Ex029 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String turno;

        System.out.println("Insira o turno em que você estuda: \n[M] Matutino \n[V] Vespertino \n[N] Noturno \nTurno:");
        turno = input.next();

        switch (turno){
            case "M": System.out.println("Bom Dia!");
            break;
            case "V": System.out.println("Boa Tarde!");
            break;
            case "N": System.out.println("Boa Noite!");
            break;
            default: System.out.println("Turno inválido.");
        }
    }
}
