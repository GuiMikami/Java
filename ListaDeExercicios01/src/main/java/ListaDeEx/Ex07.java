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
public class Ex07 {

    
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       double A, B, Hipotenusa;
               
       System.out.println("*Calcular hipotenusa do triângulo*");
      
       System.out.println("Digite Lado A ");
       A = input.nextFloat();
       System.out.println("Digite Lado B ");
       B = input.nextFloat();
       
       Hipotenusa = Math.sqrt((A*A)+(B*B));
       System.out.println("A hipotenusa do triângulo é = " + Hipotenusa);
       
       
       
       
       
       
       
       
    }
    
}
