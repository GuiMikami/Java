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
public class Ex13 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float n1,n2,n3;
        
        System.out.println("-- Imprimir o maior Numero --");
        System.out.println("Digite o primeiro numero ");
        n1 = input.nextFloat();
        System.out.println("Digite o segundo numero ");
        n2 = input.nextFloat();
        System.out.println("Digite o terceiro numero ");
        n3 = input.nextFloat();
        
        if(n1 > n2 && n1 > n3){
            System.out.println("O maior numero é: " + n1);
        }
        if(n2 > n1 && n2 > n3){
            System.out.println("O maior numero é: " + n2);
        }
        else if(n3 > n1 && n3 > n1){
            System.out.println("O maior numero é: " + n3);
}
    }
}