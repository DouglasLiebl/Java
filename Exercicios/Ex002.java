// Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
package Exercicios;
import java.util.Scanner;
public class Ex002 {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numeroDigitado = leitor.nextInt();
        System.out.println("O número digitado foi " + numeroDigitado);

    }
}
