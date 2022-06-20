/*
Faça um programa para imprimir os números pares entre 100 e 1, em ordem 
decrescente, ou seja, o laço deve iniciar em 100 e encerrar em 1.
Use o laço FOR.
 */
package ExsEstruturasRepeticao;

/**
 *
 * @author GuiMikami
 */
public class Ex05 {

    public static void main(String[] args) {

        System.out.println("--Números pares em ordem decrescente--");

        int i;

        for (i = 100; i >= 1; i -= 2) {

            System.out.println(i);

        }

    }
}
