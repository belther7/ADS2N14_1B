package view;

import java.util.Scanner;

import model.Conta;
import controller.Controller;


public class ContaComum 
{
	static final Conta conta = new Conta();
	public static void menuContaComum()
	{

		double depositov = 00.00;
		double saquev = 00.00;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("\nEscolha uma das opções: \n"
							+ "1 - Depositar\n"
							+ "2 - Sacar\n"
							+ "3 - Extrato\n"
							+ "0 - Sair do programa.\n"
							+ "Digite a opção desejada: ");
		int opMenu = teclado.nextInt();
		
		switch (opMenu)
		{
		
			case 0:
			{
				System.out.println("Volte Sempre.");
				System.exit(0);
			}
			case 1:
			{
				System.out.println("Digite o valor do depósito : ");
				depositov = teclado.nextDouble();
				if ( depositov > 0)
				{
					conta.setDeposito(depositov);
					System.out.println("Foi depositado o valor de "+depositov+" reais na sua conta.");
					System.out.println("Saldo Atual de: "+conta.getSaldo()+" reais.");
				}
				else if (depositov <= 0)
				{
					System.out.println("O valor depositado deve ser maior que 0 (zero).");
				}
				menuContaComum();
				break;
			}
			case 2:
			{
				System.out.println("Digite o valor do saque : ");
				saquev = teclado.nextDouble();
				
				if (conta.getSaldo() > 0 && saquev <= conta.getSaldo())
				{
					conta.setSaque(saquev);
					System.out.println("Foi sacado o valor de "+saquev+" da sua conta.\n"
							+ "Saldo autal é de: "+conta.getSaldo()+" reais.");
				}
				else if (conta.getSaldo() <= 0 || saquev > conta.getSaldo())
				{
					System.out.println("Saldo insuficiente. Seu saldo atual é de: "+ conta.getSaldo());
					menuContaComum();
				}
				break;
			}
			case 3:
			{
				System.out.println("Saldo atual: " + conta.getSaldo());
				menuContaComum();
				break;
			}
		
			default:
			{
				System.out.println("Opção inválida, tente novamente ou tecle 0 para sair.");
				menuContaComum();
				break;
			}
		}
	}
}
