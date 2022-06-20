/*
Leia um valor inteiro N do usuário, onde N é maior 
ou igual a 2 e menor ou igual a 1000.
Mostar a tabuada no formato:
1 X N = N
2 X N = 2N
3 X N = 3N 
...
10 X N = 10N
 */
package ListaDeExerciciosADO;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, cont = 0;

        System.out.println("Digite um valor para ter a tabuada ");
        n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            cont++;
            if (n >= 2 && n <= 1000) {
                System.out.println(cont + " X " + n + " = " + i * n);
            }

        }
        System.out.println("Número menor do que 2 ");
    }

}
