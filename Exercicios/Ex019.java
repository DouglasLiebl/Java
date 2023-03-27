// Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex019 {
    public static void main(String[] args){
        DecimalFormat convert = new DecimalFormat(".00");
        Scanner input = new Scanner(System.in);
        float downloadMB, mbps, tempoDown;
        String tempoDown2;

        System.out.println("Insira o tamanho, em MB, do arquivo a ser baixado:");
        downloadMB = input.nextFloat();
        System.out.println("Agora insira a velocidade da internet utilizada:");
        mbps = input.nextFloat();

        downloadMB = downloadMB * 8.0f;
        tempoDown = downloadMB / mbps;
        tempoDown = tempoDown / 60;

        tempoDown2 = convert.format(tempoDown);
        System.out.println("Serão necessários " + tempoDown2 + " minutos para que o download seja realizado.");

    }
}
