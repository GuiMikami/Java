/*
Programa que calcula o fatorial de um número inteiro positivo.
 */
package ExsEstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--Calcular o fatorial de um número--");
        System.out.println("Digite um número: ");
        int n = input.nextInt();
        int fatorial = n;

        if (n <= 0) {
            System.out.println("Número digitado inválido ");
        } else {
            while (n > 1) {
                fatorial = fatorial * (n - 1);
                n--;
            }

            System.out.println("Fatorial do número digitado = " + fatorial);

        }
    }
}
