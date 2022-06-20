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
public class Ex02 {
    
    public static void main(String[] args) {
    
       Scanner input = new Scanner(System.in);
   
    double base, expoente, potencia;
       
    System.out.println("*Potência entre dois números*");    
    System.out.println("Base ");
    base = input.nextFloat();
    System.out.println("Expoente ");
    expoente = input.nextFloat();
        
    potencia = Math.pow(base, expoente);
    System.out.println("A Potência é = " + potencia);
    
   
        
    }
}
