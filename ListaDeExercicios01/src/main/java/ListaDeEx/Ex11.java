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
public class Ex11 {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        float numero;
        System.out.println("*Verificar se um número é negativo ou não*");
        System.out.println("Digite um número ");
        numero = input.nextFloat();
        
       
        if(numero == 0){
            System.out.println("NÚMERO NEUTRO");
        }
        else if(numero >=1){
            System.out.println("NÚMERO POSITIVO");
        }
        else{
            System.out.println("NÚMERO NEGATIVO");
        }
    }
}
