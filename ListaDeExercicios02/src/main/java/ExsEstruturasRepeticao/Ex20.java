/*
Lista 02.
Exercício 20.
 */
package ExsEstruturasRepeticao;

import java.util.Scanner;

/**
 *
 * @author GuiMikami
 */
public class Ex20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float deposito, saque, contaZerada, ContaEstourada, ContaPreferencial;

        int opcao;

        do {
            float saldoAtual;

            System.out.println("Informe o seu saldo atual: ");
            saldoAtual = input.nextFloat();
            System.out.println("Escolha uma das opções abaixo: \n");
            System.out.println("1 - Realizar um depósito ");
            System.out.println("2 - Realizar um saque ");
            System.out.println("3 - Saldo final da conta ");
            System.out.println("Opção: ");
            opcao = input.nextInt();

        } while (opcao > 1 || opcao < 3);
    }
}

