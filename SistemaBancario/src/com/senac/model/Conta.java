package com.senac.model;

public class Conta
{
	private int numeroConta;
	protected double saldo;
	protected String tipo;
	private int numVerificacao;
	private Cliente cliente;

	public Conta(String tipo,int numeroConta, Cliente cliente)
	{
		super();
		this.numeroConta = numeroConta;
		this.tipo = tipo;
		this.saldo = 0;
	}

	public boolean Verificacao(int numVericacao)
	{
		boolean ok = false;
		if (numVericacao == this.numVerificacao)
		{
			ok = true;
		}
		return ok;
	}

	public int getNumeroConta()
	{
		return this.numeroConta;
	}

	public Cliente getClinte()
	{
		return this.cliente;
	}

	public double getSaldo()
	{
		return this.saldo;
	}

	public boolean depositar(double valor)
	{	
		boolean operacaoRealizada = false;
		if (valor > 0)
		{
			this.saldo += valor;
			operacaoRealizada = true;
		}
		else
		{
			System.err.println("Valor inválido");
		}
		return operacaoRealizada;
	}

	public boolean sacar(double valor)
	{
		boolean operacaoRealizada = false;
		if (valor > 0 && valor <= this.saldo)
		{
			this.saldo -= valor;
			operacaoRealizada = true;
		}
		else
		{
			System.err.println("Saldo Insuficiente");
		}
		return operacaoRealizada;
	}

	public String getTipo()
	{
		return this.tipo;
	}
}
