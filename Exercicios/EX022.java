// Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
package Exercicios;
import java.util.Scanner;
public class EX022 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String letra;

        System.out.println("Informe seu sexo:");
        letra = input.next();

        if (letra.equals("F")){
            System.out.println("Feminino.");
        } else if (letra.equals("M")){
            System.out.println("Masculino.");
        } else {
            System.out.println("Sexo Inválido.");
        }
    }
}
