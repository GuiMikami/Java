/*
Faça um programa para ler e escrever dados de uma turma de 5 alunos. 
O programa deve pedir dados como nome, idade e sexo. O programa deve imprimir 
os dados do aluno mais velho. Use o laço DO-WHILE.
 */
package ExsEstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, todasIdades = 0;
        int i = 1;
        String nome;
        String sexo;

        do {

            System.out.println("Digite o nome do aluno: ");
            nome = input.next();
            System.out.println("Digite a idade do aluno: ");
            idade = input.nextInt();
            System.out.println("Digite o Sexo (F/M): ");
            sexo = input.next();

            if (idade >= todasIdades) {
                todasIdades = idade;

            }
            i++;

        } while (i <= 5);

        System.out.println("O Aluno " + nome + " é o mais velho com "
                + idade + " anos " + "do sexo " + sexo + " . ");
    }
}
