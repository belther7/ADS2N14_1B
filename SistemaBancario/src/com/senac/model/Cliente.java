package com.senac.model;

public class Cliente
{
	private Pessoa cliente;
	public Cliente(String nome, int telefone, String tipoTelefone, String endereco)
	{
		cliente = new Pessoa(nome, telefone, tipoTelefone, endereco);
	}

	public Pessoa getCliente()
	{
		return this.cliente;
	}
}
