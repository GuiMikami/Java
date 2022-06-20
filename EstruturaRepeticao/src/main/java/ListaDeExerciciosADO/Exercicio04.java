/* 
Ler 06 valores do usuário usando for ao final imprimir:
Soma de todos os valores digitados que foram positivos;
Quantidade de valores digitados que foram positivos;
Média(decimal) de todos os valores digitados que foram positivos.
*/

package ListaDeExerciciosADO;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, cont = 0;
        float soma = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Número: ");
            num = input.nextInt();

            if (num >= 0) {
                soma = soma + num;
                cont++;
            } else {
                System.out.println("Número negativo");
            }
        }
        System.out.println("Soma dos valores positivos:  " + soma);
        System.out.println("Quantidade de números positivos digitados: " + cont);
        System.out.println("Média dos valores positivos: " + soma / cont);
    }

}
