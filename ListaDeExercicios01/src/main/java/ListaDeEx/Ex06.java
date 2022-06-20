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
public class Ex06 {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        double A, B, C, ATrianguloR, AreaCirculo, AreaTrapezio, AreaQuadrado, AreaRetangulo, Perimetro;
                
               
            //a)
            
                System.out.println("*Area do Triângulo Retângulo*");
                System.out.println("Digite a base ");
                A = input.nextFloat();
                System.out.println("Digite a Altura ");
                C = input.nextFloat();
                
               
                ATrianguloR = ((A*C)/2);
                System.out.println("A area do triângulo retângulo é = " + ATrianguloR);
                
            //b)
            
                System.out.println("Area do Círculo de um Raio ");
                System.out.println("Digite o raio ");
                C = input.nextFloat();
                
                AreaCirculo = (3.14159*(C*C));
                System.out.println("A area do circulo é = " + AreaCirculo);
                
            //c)
                
                System.out.println("A do trapézio ");
                System.out.println("Valor base 1 ");
                A = input.nextFloat();
                System.out.println("Valor base 2 ");
                B = input.nextFloat();
                System.out.println("Valor da Altura ");
                C = input.nextFloat();
                
                AreaTrapezio = ((A+B)*C/2);
                System.out.println("A area do trapézio é = " + AreaTrapezio);
                
                
             //d)
             
                System.out.println("Area do quadrado ");
                System.out.println("Valor do lado do quadrado ");
                B = input.nextFloat();
                
                AreaQuadrado = (B*B);
                System.out.println("A Area do quadrado é = " + AreaQuadrado);
                
            //e)
            
                System.out.println("Area de um retângulo ");
                System.out.println("Digite a base ");
                A = input.nextFloat();
                System.out.println("Digite a altura ");
                B = input.nextFloat();
                
                AreaRetangulo = (A*B);
                System.out.println("A area do retângulo é = " + AreaRetangulo);
                
            //f)
            
                System.out.println("Perímetro do retângulo");
                System.out.println("Digite a base ");
                A = input.nextFloat();
                System.out.println("Digite a altura ");
                B = input.nextFloat();
                
                Perimetro = (2*(A+B));
                System.out.println("O perímetro é = " + Perimetro);
                
      
    }
    
}
