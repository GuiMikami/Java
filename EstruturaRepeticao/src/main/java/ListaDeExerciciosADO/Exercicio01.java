/*
Faça um programa que mostre os números pares entre 1 e 100, inclusive.
*/
package ListaDeExerciciosADO;

/**
 *
 * @author GuiMikami
 */
public class Exercicio01 {

    public static void main(String[] args) {
        for(int i=0; i<=100; i++){
            
            if(i % 2 == 0){
                System.out.println("Números pares " + i);
            }
            
        }
    }
}
