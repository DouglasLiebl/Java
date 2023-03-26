/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
 --salário bruto.
 --quanto pagou ao INSS.
 --quanto pagou ao sindicato.
 --o salário líquido.
Calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
*/
package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex014 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat duasCasas = new DecimalFormat("0.00");
        int horasTrabalhadas, valorHora, salario;
        float inss, impostoRenda, sindicato, salarioLiquido;
        String inssFinal, impostoRendaFinal, sindicatoFinal, salarioLiquidoFinal, salarioFinal;

        System.out.println("Insira o número de horas trabalhadas no mês:");
        horasTrabalhadas = input.nextInt();
        System.out.println("Insira o valor por hora trabalhada:");
        valorHora = input.nextInt();
        salario = horasTrabalhadas * valorHora;

        impostoRenda = (float)salario * 0.11f;
        inss = (float)salario * 0.08f;
        sindicato = (float)salario * 0.05f;
        salarioLiquido = (float)salario - (impostoRenda + inss + sindicato);

        salarioFinal = duasCasas.format(salario);
        impostoRendaFinal = duasCasas.format(impostoRenda);
        inssFinal = duasCasas.format(inss);
        sindicatoFinal = duasCasas.format(sindicato);
        salarioLiquidoFinal = duasCasas.format(salarioLiquido);

        System.out.println("+ Salário Bruto: R$ " + salarioFinal);
        System.out.println("- Imposto de Renda: R$ " + impostoRendaFinal);
        System.out.println("- INSS: R$ " + inssFinal);
        System.out.println("- Sindicato: R$ " + sindicatoFinal);
        System.out.println("= Salário Liquido: R$ " + salarioLiquidoFinal);
    }
}
