// Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
package Exercicios;
import java.util.Scanner;
public class Ex023 {
    public static void main(String[] argas){
        Scanner input = new Scanner(System.in);
        String letra;

        System.out.println("Digite uma letra:");
        letra = input.next();

        if (letra.equals("a") || letra.equals("e") ||letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("A letra digitada é uma vogal.");
        } else {
            System.out.println("A letra digitada é uma consoante.");
        }
    }
}
