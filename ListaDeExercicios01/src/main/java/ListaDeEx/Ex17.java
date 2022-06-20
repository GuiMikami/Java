package ListaDeEx;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex17 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int A,B,C,D;
        System.out.println("Etradas A, B, C e D ");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        
        if(B>C && D>A && (C+D) > (A+B) && C>0 && D>0 && A % 2 == 0){
            System.out.println("VALORES ACEITOS ");
        }
        else{
            System.out.println("VALORES NÃO ACEITOS ");      
    }
     
        
    }
}
