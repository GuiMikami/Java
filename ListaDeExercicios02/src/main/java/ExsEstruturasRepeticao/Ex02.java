/*
 Faça um programa que leia um número N do usuário, some todos os números 
inteiros de 1 a N, e mostre o resultado obtido. Use o laço WHILE.
 */
package ExsEstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número ");
        int n = input.nextInt();
        int soma = 0, i = 1;

        while (i <= n) {

            soma = soma + i;
            i++;

        }
        System.out.println("Soma de 1 ao Número digitado = " + soma);
    }
}
