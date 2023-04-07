/*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5%
Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
*/
package Exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ex030 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat convert = new DecimalFormat(".00");
        float salario, novoSalario, valorAumento;
        String salarioA, novoSalarioA, valorAumentoA;

        System.out.println("Insira o valor do salário:");
        salario = input.nextFloat();
        salarioA = convert.format(salario);

        if (salario <= 280f) {
            novoSalario = salario * 1.20f;
            valorAumento = novoSalario - salario;
            novoSalarioA = convert.format(novoSalario);
            valorAumentoA = convert.format(valorAumento);
            System.out.println("Salário antes do reajuste: R$" + salarioA + "\nPercentual de aumento aplicado: 20% \nValor do aumento: R$ " + valorAumentoA + "\nNovo salário: R$ " + novoSalarioA);
        }
        if (salario > 280f && salario <= 700f){
            novoSalario = salario * 1.15f;
            valorAumento = novoSalario - salario;
            novoSalarioA = convert.format(novoSalario);
            valorAumentoA = convert.format(valorAumento);
            System.out.println("Salário antes do reajuste: R$" + salarioA + "\nPercentual de aumento aplicado: 15% \nValor do aumento: R$ " + valorAumentoA + "\nNovo salário: R$ " + novoSalarioA);
        }
        if (salario > 700f && salario <= 1500f){
            novoSalario = salario * 1.10f;
            valorAumento = novoSalario - salario;
            novoSalarioA = convert.format(novoSalario);
            valorAumentoA = convert.format(valorAumento);
            System.out.println("Salário antes do reajuste: R$" + salarioA + "\nPercentual de aumento aplicado: 10% \nValor do aumento: R$ " + valorAumentoA + "\nNovo salário: R$ " + novoSalarioA);
        }
        if (salario > 1500f){
            novoSalario = salario * 1.05f;
            valorAumento = novoSalario - salario;
            novoSalarioA = convert.format(novoSalario);
            valorAumentoA = convert.format(valorAumento);
            System.out.println("Salário antes do reajuste: R$" + salarioA + "\nPercentual de aumento aplicado: 5% \nValor do aumento: R$ " + valorAumentoA + "\nNovo salário: R$ " + novoSalarioA);
        }
    }
}
