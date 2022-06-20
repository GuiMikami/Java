/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDeEx;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex08 {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        float n1, n2, n3, n4, media;
        
        System.out.println("*Digite 4 números para calcular a média aritmética*");
        n1 = input.nextFloat();
        n2 = input.nextFloat();
        n3 = input.nextFloat();
        n4 = input.nextFloat();
        
        media = (n1+n2+n3+n4)/4;
        System.out.println("A média aritmética é = " + media);
        
        
    }
}
