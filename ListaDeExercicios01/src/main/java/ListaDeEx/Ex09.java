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
public class Ex09 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float HorasTrab, Valorph, Salario;
        int CodFunc;
        System.out.println("*Cód Funcionário + Salário*");
        System.out.println("Digite o código do Funcionário ");
        CodFunc = input.nextInt();
        System.out.println("Digite as horas trabalhadas ");
        HorasTrab = input.nextFloat();
        System.out.println("Digite o valor por hora trabalhada ");
        Valorph = input.nextFloat();
        
        Salario = (HorasTrab * Valorph);
        System.out.println("Funcionário Cód " + CodFunc + " tem o salário de = " + Salario);
        
        
        
         
    }
}
