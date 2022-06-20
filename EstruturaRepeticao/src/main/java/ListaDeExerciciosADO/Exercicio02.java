/*
Leia um valor inteiro X. Em seguida mostre os ímpares de 1 
até X, um valor por linha, inclusive o X, se for o caso.
*/
package ListaDeExerciciosADO;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        for(int i=0; i<=x; i++){
            
            if(i % 2 != 0){
            System.out.println("Números Impares " + i);
        }
       
        
        
    }
    }
}
