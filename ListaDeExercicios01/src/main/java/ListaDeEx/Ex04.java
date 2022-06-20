/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaDeEx;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex04 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        float n1, n2, n1cons, n2cons;         
        System.out.println("*Números consecutivos*");
        System.out.println("Digite o primeiro número ");
        n1 = input.nextFloat();
        System.out.println("Digite o segundo número ");
        n2 = input.nextFloat();
        
        n1cons = (n1 + 1);
        n2cons = (n2 + 1);
        
        System.out.println("Os números consecultivos são: " + n1cons + " e " + n2cons);
       
        }
                
}
