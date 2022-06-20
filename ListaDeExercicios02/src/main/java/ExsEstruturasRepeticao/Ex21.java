/*
Na matemática, um número perfeito é um número inteiro para o qual a soma de 
todos os seus divisores positivos próprios (excluindo ele mesmo) é igual ao 
próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. 
Sua tarefa é escrever um programa que imprima se um determinado número é
perfeito ou não. Utilize o laço que lhe for mais conveniente.
 */
package ExsEstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int divisor;
        int n = input.nextInt();

        for (divisor = 1; divisor <= n; divisor++) {
            if (n != 0) {
                if (n % divisor == 0) {
                    System.out.println(divisor);

                } else {
                    System.out.println("Zero não é divisor de nenhum número natural.");
                    break;
                }

            }
        }
    }
}
