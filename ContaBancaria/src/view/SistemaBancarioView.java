package view;

import java.util.Scanner;

import controller.Controller;
import model.Conta;
import view.ContaComum;

public class SistemaBancarioView 
{
	public static final Scanner teclado = new Scanner (System.in);
	public void printConta() 
	{
		
	}
	public void welcome()
	{
		System.out.println("Bem vindo ao Sistema Bancário.\n"
				+ "Qual o tipo de conta que gostaria de criar:\n"
				+ "1 - Conta Comum\n"
				+ "2 - Conta Especial\n"
				+ "3 - Conta Investimento\n"
				+ "0 - Sair do programa.");

		int opTipo = teclado.nextInt();
			
		switch (opTipo)
		{
		
			case 0: 
			{
				System.out.println("Volte Sempre.");
				System.exit(0);
			}
		
			case 1: 
			{
				System.out.println("Tipo de conta escolhida: Conta Comum.\n");
			
				final Conta conta = new Conta();
				
				printConta();
				{
					Controller sistemabancario = new Controller();

					System.out.println("Conta: " + sistemabancario.geradorConta());
					System.out.println("Verificação: " + sistemabancario.geradorVerificacao());
					System.out.println("Saldo atual: " + sistemabancario.geradorSaldo());
				}
				ContaComum.menuContaComum();
				
			}
			case 2: 
			{
				System.out.println("Tipo de conta escolhida: Conta Especial.\n");
			
			}
			case 3: 
			{
				System.out.println("Tipo de conta escolhida: Conta Investimento.\n");
			
			}
			default:
			{
				System.out.println("\nOpção inválida, tente novamente ou digite '0' para sair.\n");
				welcome();
			}
		}		
	}
}