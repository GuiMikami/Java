/*Escreva um programa que leia um conjunto de 10 números inteiros positivos. 
Seu programa deve determinar e imprimir o maior deles. Use o laço FOR.
 */
package ExsEstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = 0;
        System.out.println("Digite 10 números inteiros: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: ");
            int n = input.nextInt();

            if (n > maior) {
                maior = n;
            }

        }
        System.out.println("Maior número = " + maior);
    }
}
