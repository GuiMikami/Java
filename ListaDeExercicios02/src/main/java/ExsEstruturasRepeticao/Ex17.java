/*
Ler um número inteiro N e calcular e imprimir todos os seus divisores.
Exemplo: para o número 6, temos os seguintes divisores 1, 2, 3, 6. 
Utilize o laço que lhe for mais conveniente.
 */
package ExsEstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex17 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("--Divisores do número digitado--");
        System.out.println("Digite um número: ");
        int i;
        int n = input.nextInt();
        
        if (n == 0) {
            System.out.println("Zero não é divisor de nenhum número natural.");
        } else {
            for (i = 1; i <= n; i++) {

                if (n % i == 0) {
                    System.out.println(i);
                }

            }

        }
    }

}
