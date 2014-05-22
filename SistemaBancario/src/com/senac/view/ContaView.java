package com.senac.view;

import java.util.Scanner;

import com.senac.controller.ContaController;

public class ContaView
{
	private static ContaController contaController;
	private static Scanner teclado = new Scanner(System.in);
	public ContaView()
	{
		ContaView.contaController = new ContaController();
	}
	public static boolean validarNomes(String nomes)
	{
		boolean erro = false;
		if (nomes.length() < 3)
		{
			erro = true;
		}
		return erro;
	}
	private static void criarCliente()
	{
		//Criar novo Cliente
		String nome = "";
		String rua = "";
		String cidade = "";
		int numeroEndereco = 0;
		boolean erro = false;
		
		//Nome completo
		teclado.nextLine();
		do
		{
			teclado.reset();
			System.out.println("Digite o nome completo do cliente:");
			nome = teclado.nextLine();
			teclado.reset();
		}while (validarNomes(nome));

		teclado.reset();
		
		// Endereço completo
		do
		{
			System.out.println("Digite a rua");
			rua = teclado.nextLine();
			teclado.reset();
		}while (validarNomes(rua));
		do
		{
			try
			{
				System.out.println("Digite o número");
				numeroEndereco = Integer.parseInt(teclado.nextLine());
				teclado.reset();
			}
			catch (Exception e)
			{
				System.err.println("Numero inválido");
				erro = true;
			}
		}while (erro);
		do
		{
			System.out.println("Digite o Cidade");
			cidade = teclado.nextLine();
			teclado.reset();
		}while (validarNomes(cidade));
		String endereco = "Rua " + rua + " , " + numeroEndereco + " - "
				+ cidade;

		// Telefone e tipo de telefone
		System.out.println("Digite o tipo de telefone");
		String tipoTelefone = teclado.nextLine();
		teclado.reset();
		boolean testeTelefone = true;
		int telefone = 0;
		while (testeTelefone)
		{
			System.out.println("Digite o telefone");
			try
			{
				telefone = Integer.parseInt(teclado.nextLine());
				testeTelefone = false;
			}
			catch (Exception e)
			{
				testeTelefone = true;
				System.err.println("Dados inválidos");
			}
		}
		contaController.criarCliente(nome, telefone, tipoTelefone, endereco);
		System.out.println("Operação realizada com sucesso");
		System.out.println("======================");
		System.out.println("++++++++++++++++++++++");
	}
	
	private static void criarConta()
	{
		criarCliente();
		System.out.println("Digite o numero da conta");
		int numeroConta = teclado.nextInt();
		contaController.criarContaComum(numeroConta);
	}

	private static void criarContaEspecial()
	{
		criarCliente();
		System.out.println("Digite o numero da conta");
		int numeroConta = teclado.nextInt();
		System.out.println("Digite o limite inicial");
		double limiteInicial = teclado.nextDouble();
		contaController.criarContaEspecial(numeroConta, limiteInicial);
	}

	private static void criarContaInvestimento()
	{
		criarCliente();
		System.out.println("Digite o numero da conta");
		int numeroConta = teclado.nextInt();
		System.out.println("Digite a data da de hoje");
		String data = teclado.next();
		contaController.criarContaInvestimento(numeroConta, data);
	}

	public static void menuPrincipal()
	{
		int op = 0;
		boolean continuar = true;
		System.out.println("Banco Nacional");
		String menuInicial = "1 - Criar Conta \n2 - Acessar Conta \n3 - Sair";
		while (continuar)
		{
			System.out.println("Selecione a opção desejada");
			System.out.println("++++++++++++++++++++++");
			System.out.println(menuInicial);
			System.out.println("++++++++++++++++++++++");
			op = teclado.nextInt();
			switch (op)
			{
				case 1:
					menuCriarConta();
					break;
				case 2:
					System.out.println("Acessar Conta");
					menuAcessarConta();
					break;
				case 3:
					System.out.println("você deseja Sair ? 1 para sair");
					if (teclado.nextInt() == 1)
					{
						continuar = false;
					}
					break;
				default:
					System.err.println("Opção Inválida");
			}
		}
	}
	
	private static void menuCriarConta()
	{
		int op = 0;
		boolean continuar = true;
		String menu = "1 - Criar Conta normal \n2 - Criar conta especial \n3 - Criar conta de Investimentos \n4 - Sair";
		while (continuar)
		{
			try
			{
				System.out.println("Selecione a opção desejada");
				System.out.println("++++++++++++++++++++++");
				System.out.println(menu);
				System.out.println("++++++++++++++++++++++");
				op = teclado.nextInt();
			}
			catch (Exception e)
			{
				System.out.println("Digite novamente\n");
				teclado.next();
				op = 0;
			}
			switch (op)
			{
				case 1:
					criarConta();
					continuar = false;
					break;
				case 2:
					criarContaEspecial();
					continuar = false;
					break;
				case 3:
					criarContaInvestimento();
					continuar = false;
					break;
				case 4:
					System.out.println("você deseja Sair ? S - para sair");
					if (teclado.next().equalsIgnoreCase("S"))
					{
						continuar = false;
					}
					break;
				default:
					System.err.println("Opção Inválida");
			}
		}
	}

	private static void menuAcessarConta()
	{
		String tipo = contaController.getTipoContaAtiva();
		if (tipo.equalsIgnoreCase("Comum"))
		{
			AcessarContaComun();
		}
		if (tipo.equalsIgnoreCase("Investimento"))
		{
			AcessarContaInvestimento();
		}
		if (tipo.equalsIgnoreCase("Especial"))
		{
			AcessarContaEspecial();
		} else
		{
			System.err.println("Erro");
			System.out.println(tipo);
		}
	}

	private static void AcessarContaComun()
	{
		String dados = "Cliente : "
				+ contaController.getCliente().getCliente().getNome()
				+ " - Conta " + contaController.getNumeroContaComum()
				+"\n Conta " + contaController.getTipoContaAtiva();
		System.out.println(dados);
		System.out.println("Selecione a opção desejada");
		int opc = 0;
		boolean acesso = true;
		while (acesso)
		{
			try
			{
				System.out.println("+++++++++++++++++++++++++++");
				System.out
						.println("1 - Consultar Saldo \n2 - Depositar \n3 - Sacar\n4 - Sair");
				System.out.println("+++++++++++++++++++++++++++");
				opc = teclado.nextInt();
			}
			catch (Exception e)
			{
				System.out.println("Erro " + e);
				teclado.next();
			}
			switch (opc)
			{
				case 1:
					// Consultar Saldo
					System.out.println("Saldo:"
							+ contaController.getSaldoContaComum());
					break;
				case 2:
					// Depositar
					System.out.println("Digite o valor de Deposito");
					double deposito = teclado.nextDouble();
					if (deposito > 0)
					{
						contaController.depositarContaComun(deposito);
					}
					else
					{
						System.out.println("Valor inválido");
					}
					break;
				case 3:
					// Sacar
					System.out.println("Digite o valor de Saque");
					double saque = teclado.nextDouble();
					if (saque > 0)
					{
						contaController.sacarContaComum(saque);
					}
					break;
				case 4:
					// Sair
					System.out.println("Deseja Sair ? S para sim");
					String aux = teclado.next();
					if (aux.equalsIgnoreCase("s"))
					{
						acesso = false;
					}
					break;
				default:
					System.err.println("Opção Inválida");
			}
		}
	}

	private static void AcessarContaEspecial()
	{
		String dados = "Cliente : "
				+ contaController.getCliente().getCliente().getNome()
				+ " - Conta " + contaController.getNumeroContaEspecial();
		System.out.println(dados);
		System.out.println("Selecione a opção desejada");
		int opc = 0;
		boolean acesso = true;
		while (acesso)
		{
			System.out.println("+++++++++++++++++++++++++++");
			System.out
					.println("1 - Consultar Saldo \n2 - Depositar \n3 - Sacar\n4 - Consultar Limite \n5 - Alterar limite\n6 - Sair");
			System.out.println("+++++++++++++++++++++++++++");
			opc = teclado.nextInt();
			switch (opc)
			{
				case 1:
					// Consultar Saldo
					System.out.println("Saldo:"
							+ contaController.getSaldoContaEspecial());
					break;
				case 2:
					// Depositar
					System.out.println("Digite o valor de Deposito");
					double deposito = teclado.nextDouble();
					if (deposito > 0)
					{
						contaController.depositarContaEspecial(deposito);
					}
					else
					{
						System.out.println("Valor inválido");
					}
					break;
				case 3:
					// Sacar
					System.out.println("Digite o valor de Saque");
					double saque = teclado.nextDouble();
					if (saque > 0)
					{
						contaController.sacarContaEspecial(saque);
					}
					break;
				case 4:
					System.out.println("Seu limite é "
							+ contaController.getLimiteContaEspecial());
					break;
				case 5:
					System.out.println("Digite o novo Limite ");
					double novoLimite = teclado.nextDouble();
					contaController.alterarLimiteContaEspecial(novoLimite);
					System.out.println("Limite alterado");
					break;
				case 6:
					// Sair
					System.out.println("Deseja Sair ? S para sim");
					String aux = teclado.next();
					if (aux.equalsIgnoreCase("s"))
					{
						acesso = false;
					}
					break;
				default:
					System.err.println("Opção Inválida");
			}
		}
	}

	private static void AcessarContaInvestimento()
	{
		String dados = "Cliente : "
				+ contaController.getCliente().getCliente().getNome();
		System.out.println(dados);
		System.out.println("Selecione a opção desejada");
		int opc = 0;
		boolean acesso = true;
		while (acesso)
		{
			System.out.println("+++++++++++++++++++++++++++");
			System.out
					.println("1 - Consultar Saldo \n2 - Depositar \n3 - Sacar\n4 - Gerar investimento\n5 - Visualizar Taxa de investimento\n6 - Alterar taxa\n7 - Sair");
			System.out.println("+++++++++++++++++++++++++++");
			opc = teclado.nextInt();
			switch (opc)
			{
				case 1:
					// Consultar Saldo
					System.out.println("Saldo:"
							+ contaController.getSaldoContaInvestimento());
					break;
				case 2:
					// Depositar
					System.out.println("Digite o valor de Deposito");
					double deposito = teclado.nextDouble();
					if (deposito > 0)
					{
						contaController.depositarContaInvestimento(deposito);
					}
					else
					{
						System.out.println("Valor inválido");
					}
					break;
				case 3:
					// Sacar
					System.out.println("Digite o valor de Saque");
					double saque = teclado.nextDouble();
					if (saque > 0)
					{
						contaController.sacarContaInvestimento(saque);
					}
					break;
				case 4:
					// Aplicar taxa Financeira
					System.out.println("Gerar investimento");
					contaController.aplicarTaxaContaInvestimento();
					break;
				case 5:
					double valor = 100 * contaController.getTaxaContaInvestimento();
					System.out.println("Percentual de rendimento mensal \n "
							+ valor + "% ao mês");
					break;
				case 6:
					// Alterar taxa de investimento
					System.out
							.println("Digite o valor em percentula da nova taxa - exmplo 5%");
					double novaTaxa = teclado.nextDouble();
					novaTaxa /= 100;
					contaController.alterarTaxaContaInvestimento(novaTaxa);
					break;
				case 7:
					// Sair
					System.out.println("Deseja Sair ? S para sim");
					String aux = teclado.next();
					if (aux.equalsIgnoreCase("s"))
					{
						acesso = false;
					}
				break;
			default:
				System.err.println("Opção Inválida");
			}
		}
	}
}
