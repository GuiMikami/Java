/*
A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é conhecida como 
série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, 
é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N 
(onde N < 46) e mostre os N primeiros números dessa série. 
Utilize o laço que lhe for mais conveniente.
 */
package ExsEstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int anterior2 = 1, anterior1 = 0, aux;
        System.out.println("--Sequencia Fibonacci--");
        System.out.println("Digite a quantidade de números da sequencia fibonacci ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(anterior2);
            aux = anterior2;
            anterior2 = anterior2 + anterior1;
            anterior1 = aux;

        }
        System.out.println("Total números da sequencia fibonacci digitado: " + n);
    }

}
