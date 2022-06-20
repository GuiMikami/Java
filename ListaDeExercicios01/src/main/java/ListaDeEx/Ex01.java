package ListaDeEx;

import java.util.Scanner;

/**
 *
 * @author guilherme.mikami
 */
public class Ex01 {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
      
    float n1,n2,multiplicacao;
    
    System.out.println("*Multiplicação de dois números*");
    System.out.println("Numero 1 ");
    n1 = input.nextFloat();
    System.out.println("Numero 2 ");
    n2 = input.nextFloat();
    
    multiplicacao = (n1*n2);
    
    System.out.println("Multiplicação = " + multiplicacao);
    
    
    }
   
   
    
   
    
    
    
}
