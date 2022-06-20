/*
Lista 02.
Exercício 10.
*/
package ExsEstruturasRepeticao;


/**
 *
 * @author GuiMikami
 */
public class Ex10 {

    public static void main(String[] args) {
        int numerador = 1;
        float div;
        float soma = 1;
        for (int i = 1; i <= 20; i++) {
            div = (numerador/ i);
            soma = soma + div;
        }
        
        System.out.printf("Soma = %.2f", soma);
    }

}
