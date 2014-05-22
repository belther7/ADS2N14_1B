package com.senac.controller;

import com.senac.model.Cliente;
import com.senac.model.Conta;
import com.senac.model.ContaEspecial;
import com.senac.model.ContaInvestimento;

public class ContaController
{
	private Cliente cliente;
	private Conta conta;
	private ContaEspecial contaEspecial;
	private ContaInvestimento contaInvestimento;
	private String TipoDeContaAtiva;
	public ContaController()
	{
		this.cliente = null;
		this.conta = null;
		this.contaEspecial = null;
		this.contaEspecial = null;
		this.TipoDeContaAtiva = "Nenhuma Conta Criada";
	}
	// Getters
	public Cliente getCliente()
	{
		return cliente;
	}

	public String getTipoContaAtiva()
	{
		return TipoDeContaAtiva;
	}

	// Criar contas
	public void criarCliente(String nome, int telefone, String tipoTelefone, String endereco)
	{
		Cliente cliente = new Cliente(nome, telefone, tipoTelefone, endereco);
		this.cliente = cliente;
	}

	public void criarContaComum(int numeroConta)
	{
		this.TipoDeContaAtiva = "Comum";
		if (this.cliente == null)
		{
			System.err.println("Erro, Criar novo cliente Primeiro");
		}
		else
		{
			this.conta = new Conta("Comum", numeroConta, this.cliente);
		}
	}

	public void criarContaEspecial(int numeroConta, double limite)
	{
		this.TipoDeContaAtiva = "Especial";
		if (this.cliente == null)
		{
			System.err.println("Erro, Criar novo cliente Primeiro");
		}
		else
		{
			this.contaEspecial = new ContaEspecial("Especial", numeroConta,
					this.cliente, limite);
		}
	}

	public void criarContaInvestimento(int numeroConta, String data)
	{
		this.TipoDeContaAtiva = "Especial";
		if (this.cliente == null)
		{
			System.err.println("Erro, Criar novo cliente Primeiro");
		}
		else
		{
			this.contaInvestimento = new ContaInvestimento("Investimento", numeroConta,
					this.cliente, data);
		}
	}

	// Metodos Conta Comum
	public double getSaldoContaComum()
	{
		return conta.getSaldo();
	}

	public void depositarContaComun(double deposito)
	{
		conta.depositar(deposito);
	}

	public void sacarContaComum(double saque)
	{
		conta.sacar(saque);
	}

	public int getNumeroContaComum()
	{
		return conta.getNumeroConta();
	}

	// Metodos conta Especial
	public int getNumeroContaEspecial()
	{
		return contaEspecial.getNumeroConta();
	}

	public double getSaldoContaEspecial()
	{
		return contaEspecial.getSaldo();
	}

	public void depositarContaEspecial(double deposito)
	{
		contaEspecial.depositar(deposito);
	}

	public void sacarContaEspecial(double saque)
	{
		contaEspecial.sacar(saque);
	}

	public double getLimiteContaEspecial()
	{
		return contaEspecial.getLimite();
	}

	public void alterarLimiteContaEspecial(double novoLimite)
	{
		contaEspecial.alterarLimite(novoLimite);
	}

	// Metodos conta Investimento
	public double getSaldoContaInvestimento()
	{
		return contaInvestimento.getSaldo();
	}

	public void depositarContaInvestimento(double deposito)
	{
		contaInvestimento.depositar(deposito);
	}

	public void sacarContaInvestimento(double saque)
	{
		contaInvestimento.sacar(saque);
	}

	public void aplicarTaxaContaInvestimento()
	{
		contaInvestimento.aplicarTaxa();
	}

	public double getTaxaContaInvestimento()
	{
		return contaInvestimento.getTaxa();
	}

	public void alterarTaxaContaInvestimento(double novaTaxa)
	{
		contaInvestimento.alterarTaxa(novaTaxa);
	}
}