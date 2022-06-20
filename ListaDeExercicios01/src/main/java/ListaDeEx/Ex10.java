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
public class Ex10 {
    
    public static void main(String[] args) {
       
        
        double totalv,areceber,fixo; 
        String nome;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome do vendedor ");
        nome = input.nextLine();
        System.out.println("Salário Fixo ");
        fixo = input.nextDouble();
        System.out.println("Total de vendas ");
        totalv = input.nextDouble();
        
        areceber = (totalv * 0.15) + fixo;
        System.out.println("Total a receber no final do mês " + areceber);
       
        
        
        
        
        
    }
    
}
