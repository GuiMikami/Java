/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem 
"Senha Invalida". Quando a senha for informada corretamente deve ser impressa 
a mensagem "Acesso Permitido" e o algoritmo encerrado. 
Considere que a senha correta é o valor 2002. Utilize o laço que lhe for mais 
conveniente.
 */
package ExsEstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senhaValida = 2002, senha;

        System.out.println("Senha: ");
        senha = input.nextInt();

        while (senhaValida != senha) {
            System.out.println("Senha Inválida! ");
            System.out.println("Digite a senha novamente: ");
            senha = input.nextInt();
        }
        System.out.println("Acesso Permitido! ");

    }

}
