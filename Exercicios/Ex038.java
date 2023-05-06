/* Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
*/
package Exercicios;
import java.util.Scanner;
public class Ex038 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero, centena, dezena, unidade;
        String Centena, Dezena, Unidade, separador1, separador2;
        separador1 = "";
        separador2 = "";

        System.out.println("Insira um número inteiro menor até 1000:");
        numero = input.nextInt();

        if (numero >= 100){
            System.out.println("Número inválido! Insira outro número:");
            numero = input.nextInt();
        }

        centena = numero / 100;
        dezena = (numero % 100) / 10;
        unidade = numero % 10;

        if (centena == 0){
            Centena = "";
        } else if (centena == 1){
            Centena = centena + " centena";
        } else {
            Centena = centena + " centenas";
        }

        if (dezena == 0){
            Dezena = "";
        } else if (dezena == 1){
            Dezena = dezena + " dezena";
        } else {
            Dezena = dezena + " dezenas";
        }

        if (unidade == 0){
            Unidade = "";
        } else if (unidade == 1){
            Unidade = unidade + " unidade";
        } else {
            Unidade = unidade + " unidades";
        }

        if (centena > 0){
            if (dezena > 0 && unidade > 0){
                separador1 = ", ";
                separador2 = " e ";
            } else if ( dezena == 0 && unidade > 0 || dezena > 0 && unidade == 0){
                separador1 = " e ";
                separador2 = "";
            } else {
                separador1 = "";
                separador2 = "";
            }

        } else if (centena == 0){
            separador1 = "";
            if (dezena == 0){
                separador2 = "";
            } else if (dezena > 0 && unidade > 0){
                separador2 = " e ";
            }
        }

        System.out.println("Número: " + numero + "\n" + Centena + separador1 + Dezena + separador2 + Unidade);
    }
}
