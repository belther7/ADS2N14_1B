package com.senac.controller;

import com.senac.pilha.Pilha;
import com.senac.view.ConsoleView;

public class Calculadora
{
	private String expressao;
	private ConsoleView view;
	private Pilha<Double> numeros;
	private Pilha<String> operador;

	public Calculadora()
	{
		this.expressao = "";
		view = new ConsoleView();
		this.numeros = new Pilha<Double>();
		this.operador = new Pilha<String>();
	}

	public void run()
	{
		this.expressao = view.readLine("Digite uma expressão");
		tratarExpressao();
		String resultado = String.valueOf(numeros.pop());
		view.showMessage(resultado);
	}

	private void tratarExpressao()
	{
		String temp = "";
		for (int i = 0; i < this.expressao.length(); i++)
		{
			if (!isOperador(String.valueOf(this.expressao.charAt(i))))
			{
				temp = temp + String.valueOf(this.expressao.charAt(i));
			}
			else
			{
				if (numeros.isEmpyt())
				{
					numeros.push(Double.parseDouble(temp));
					operador.push(String.valueOf(this.expressao.charAt(i)));
					temp = "";
				}
				else if (!numeros.isEmpyt())
				{

					numeros.push(calcular(Double.parseDouble(temp)));

					operador.push(String.valueOf(this.expressao.charAt(i)));
					temp = "";
				}
			}
		}
		if (!temp.equals(""))
		{

			numeros.push(calcular(Double.parseDouble(temp)));
		}
	}

	private boolean isOperador(String str)
	{
		boolean result = false;
		if (str.equals("*"))
		{
			result = true;
		}
		if (str.equals("/"))
		{
			result = true;
		}
		if (str.equals("+"))
		{
			result = true;
		}
		if (str.equals("-"))
		{
			result = true;
		}
		return result;
	}

	private double calcular(double valor2)
	{
		String op = (String) operador.pop();
		double valor1 = (double) numeros.pop();
		double resultado = 0;
		if (op.equals("+"))
		{
			resultado = valor1 + valor2;
		}
		if (op.equals("-"))
		{
			resultado = valor1 - valor2;
		}
		if (op.equals("*"))
		{
			resultado = valor1 * valor2;
		}
		if (op.equals("/"))
		{
			resultado = valor1 / valor2;
		}
		return resultado;
	}

	public static void main(String[] args)
	{
		new Calculadora().run();
	}
}