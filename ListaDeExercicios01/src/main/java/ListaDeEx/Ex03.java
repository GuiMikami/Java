/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDeEx;

import java.util.Scanner;

/**
 *
 * @author guilherme.mikami
 */
public class Ex03 {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float n1, n2, qnumero;
        
        System.out.println("*Soma do quadrado de dois números*");
        System.out.println("Primeiro número ");
        n1 = input.nextFloat();
        System.out.println("Segundo número ");
        n2 = input.nextFloat();
        
        qnumero = ((n1*n1)+(n2*n2));
        System.out.println("A soma do quadrado de dois numeros é = " + qnumero);
        
    }
    
    
}
