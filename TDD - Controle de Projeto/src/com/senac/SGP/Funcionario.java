package com.senac.SGP;

public class Funcionario
{
	private int matricula;
	private double salario;
	private Cargo cargo;
	private Pessoa pessoa;
	private static int PROXIMA_MATRICULA;

	public Funcionario(Pessoa pessoa, Cargo cargo, double salario)
	{
		matricula();
		this.pessoa = pessoa;
		this.matricula = PROXIMA_MATRICULA;
		this.cargo = cargo;
		this.salario = salario;
	}

	private void matricula()
	{
		Funcionario.PROXIMA_MATRICULA ++;
	}
	
	public int getMatricula()
	{
		return this.matricula;
	}

	public double getSalario()
	{
		return this.salario;
	}
	public Cargo getCargo()
	{
		return this.cargo;
	}
}