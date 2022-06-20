/*
Crie um laço que imprima uma contagem regressiva de 100 a 0,
mas que decremente de 5 em 5.
*/
package ListaDeExerciciosADO;

/**
 *
 * @author GuiMikami
 */
public class Exercicio03 {
    public static void main(String[] args) {
        
        System.out.println("--Contagem regressiva decrementando 5--");
        for(int i=100; i>=0; i-=5){
            System.out.println(i);
        }
    }
}
