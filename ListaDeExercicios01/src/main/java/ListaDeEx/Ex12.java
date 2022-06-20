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
public class Ex12 {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double L, R,area, raio;
       
        System.out.println("-- Qual é maior area quadrado ou círculo --");
        System.out.println("Valor L de um quadrado ");
        L = input.nextFloat();
        System.out.println("Valor R de um círculo ");
        R = input.nextFloat();
        
        area = Math.pow(L, 2);
        raio = (3.14159 * Math.pow(R, 2));
        
        if(area > raio){
            System.out.println("QUADRADO É MAIOR");
        }
        if(raio > area){
            System.out.println("CIRCULO É MAIOR");
        }
        
        
        
        
               
                
        
       
        
    }
}
