/*
Calcular e mostrar a média aritmética dos números pares compreendidos 
entre 13 e 73. Utilize o laço que lhe for mais conveniente.
 */
package ExsEstruturasRepeticao;

/**
 *
 * @author GuiMikami
 */
public class Ex08 {

    public static void main(String[] args) {
        int cont = 0, media, somapar = 0;
        for (int i = 13; i <= 73; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                somapar = somapar + i;
                cont++;

            }

        }
        media = somapar / cont;
        System.out.println("Soma dos números pares entre 13 e 73: " + somapar);
        System.out.println("Quantidade de números pares entre 13 e 73: " + cont);
        System.out.println("Média dos números pares: " + media);
    }
}
