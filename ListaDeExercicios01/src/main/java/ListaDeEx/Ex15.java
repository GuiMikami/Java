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
public class Ex15 {
 
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
   
    float a, b, c;
    double delta;
    
    System.out.println("*Para encontrar as raízes de uma equação digite*");
    System.out.println("Valor de A ");
    a = input.nextFloat();
    System.out.println("Valor de B ");
    b = input.nextFloat();
    System.out.println("Valor de C ");
    c = input.nextFloat();
    
delta = Math.pow(b, 2)-(4*a*c);
        
   if(delta < 0){   //delta < 0 não existem raízes.
       System.out.println("IMPOSSIVEL CALCULAR");
   }
   if(delta == 0){  //delta == 0 existe apenas uma raíz.
       double x;
       x = -b /(2*a);
       System.out.println("x' e x'' = " + x);
   }
   if(delta > 0){ //delta > 0 existem duas raízes.
       double x1,x2;
       x1 = (-b + Math.sqrt(delta)) / (2*a);
       x2 = (-b - Math.sqrt(delta)) / (2*a);
       System.out.println("x' = " + x1);
       System.out.println("x'' = " + x2);
       
   }
    
   
    
          
    
       
        
    }
    
}
