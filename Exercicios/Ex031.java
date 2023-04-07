/*
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20%
*/
package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex031 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat round = new DecimalFormat("00");
        float horas, valorHora, salarioB, teste, ir, descontos, sindicato;
        String irA, sindicatoA, FGTS, descontosA, salarioL;

        System.out.println("Insira o valor por hora trabalhada:");
        valorHora = input.nextFloat();
        System.out.println("Insira a quantidades de horas trabalhadas:");
        horas = input.nextFloat();

        salarioB = horas * valorHora;
        FGTS = round.format(salarioB * 0.11f);
        sindicato = salarioB * 0.03f;
        sindicatoA = round.format(sindicato);

        if (salarioB <= 900f){
            irA = "Isento";
            descontos = sindicato;
            salarioL = round.format(salarioB - descontos);
            descontosA = round.format(descontos);
            System.out.println("Salário Bruto: (" + valorHora + " * " + horas + "): R$ " + salarioB + "\n(-) IR: " + irA + " \n(-) Sindicato (3%): R$ " + sindicatoA + "\nFGTS (11%): R$ " + FGTS + "\nTotal de descontos: R$ " + descontosA + "\nSalário líquido: R$ " + salarioL);
        } else if (salarioB > 900f && salarioB <= 1500f){
            ir = salarioB * 0.05f;
            descontos = sindicato + ir;
            irA = round.format(ir);
            descontosA = round.format(descontos);
            salarioL = round.format(salarioB - descontos);
            System.out.println("Salário Bruto: (" + valorHora + " * " + horas + "): R$ " + salarioB + "\n(-) IR: R$ " + irA + " \n(-) Sindicato (3%): R$ " + sindicatoA + "\nFGTS (11%): R$ " + FGTS + "\nTotal de descontos: R$ " + descontosA + "\nSalário líquido: R$ " + salarioL);
        } else if (salarioB > 1500f && salarioB <= 2500f){
            ir = salarioB * 0.10f;
            descontos = sindicato + ir;
            irA = round.format(ir);
            descontosA = round.format(descontos);
            salarioL = round.format(salarioB - descontos);
            System.out.println("Salário Bruto: (" + valorHora + " * " + horas + "): R$ " + salarioB + "\n(-) IR: R$ " + irA + " \n(-) Sindicato (3%): R$ " + sindicatoA + "\nFGTS (11%): R$ " + FGTS + "\nTotal de descontos: R$ " + descontosA + "\nSalário líquido: R$ " + salarioL);
        } else {
            ir = salarioB * 0.20f;
            descontos = sindicato + ir;
            irA = round.format(ir);
            descontosA = round.format(descontos);
            salarioL = round.format(salarioB - descontos);
            System.out.println("Salário Bruto: (" + valorHora + " * " + horas + "): R$ " + salarioB + "\n(-) IR: R$ " + irA + " \n(-) Sindicato (3%): R$ " + sindicatoA + "\nFGTS (11%): R$ " + FGTS + "\nTotal de descontos: R$ " + descontosA + "\nSalário líquido: R$ " + salarioL);
        }
    }
}
