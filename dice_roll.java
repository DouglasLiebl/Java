import java.util.Scanner;
import java.util.Random;
public class dice_roll {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número de vezes que deseja rolar o dado:");
        int n_vezes = input.nextInt();
        int cont = 0;

        while (cont < n_vezes){
            System.out.println((cont + 1) + "ª rolada: " + dice_roll());
            cont += 1;
        }

    }
    public static int dice_roll(){
        Random dado = new Random();
        int numero_sorteado = dado.nextInt((6 - 1) + 1) + 1;
        return numero_sorteado;

    }
}
