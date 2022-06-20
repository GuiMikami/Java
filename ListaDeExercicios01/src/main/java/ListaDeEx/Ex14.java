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
public class Ex14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float n1,n2,div;
        
        System.out.println("-- Divisão do maior numero pelo menor -- ");
        System.out.println("Digite o primeiro numero ");
        n1 = input.nextFloat();
        System.out.println("Digite o segundo numero ");
        n2 = input.nextFloat();
        
        if(n1 > n2){
            div = n1/n2;
            System.out.println("A divisão é = " + div); 
        }
        if(n2 > n1){
            div = n2/n1;
            System.out.println("A divisão é = " + div);
    }
        
    }
    
}
