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
public class Ex16 {
    
    public static void main(String[] args) {
        
    
    
    Scanner input = new Scanner(System.in);
    
    float hi,hf,th; // hi == hora inicial, hf == hora final, th == total de horas
    
    
    System.out.println("Hora Inicial ");
    hi = input.nextFloat();
    System.out.println("Hora Final ");
    hf = input.nextFloat();
    
    th = 24 - (24 + hi - hf) %24;
    
    if(th < 1){
        System.out.println("Duração inferior a 1 Hora ");
    }
    if(th > 24){
        System.out.println("Duração superior a 24 Horas ");
    }
    else{
        System.out.println("Duração total do jogo " + th + " horas");
    }
    
    
    
    }  
    
            
    
}
