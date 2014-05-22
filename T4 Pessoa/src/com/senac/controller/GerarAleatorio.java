package com.senac.controller;

public class GerarAleatorio
{
	public String gerarNomeAleatorio()
	{
		String[] nome = { "Thiago", "João", "Diego", "Guilherme", "Diego",
				"Pedro", "Rafael", "Nicole", "Aline", "Jéssica", "Maria",
				"Priscila", "Gabriela", "Débora", "Alex" };
		String[] sobreNome = { "Santos", "Silva", "Lima", "Martins", "Duarte",
				"Moura", "Antunes" };
		int aux1 = (int) (Math.random() * nome.length - 1);
		int aux2 = (int) (Math.random() * sobreNome.length - 1);
		return nome[aux1] + " " + sobreNome[aux2];
	}

	public String gerarTipoTelefoneAleatorio()
	{
		int aux = 0;
		aux = (int) (Math.random() * 3);
		String[] tipoTelefoneAleatorio = { "Pessoal", "Comercial",
				"Residencial" };
		return tipoTelefoneAleatorio[aux];
	}

	public String gerarNumeroAleatorio()
	{
		String numeroAleatorio = "";
		int prefixo  = ((int) (Math.random() * 9000)+ 1000);
		int sufixo = ((int) (Math.random() * 9000)+ 1000);
		numeroAleatorio = (prefixo+""+ sufixo);
		return numeroAleatorio;
	}

	public String gerarEndereco()
	{
		String[] rua = { "AV. Assis Brasil", "AV. Manoel Elias",
				"AV. Sertorio", "AV. Protasio Alves",
				"R. General Lima e Silva", "R. Getulio Vargas", "AV. Iriranga" };
		String[] cidade = { "Porto Alegre", "Gravatai", "Novo Hamburgo",
				"São Leopoldo" };
		int numero = (int) (Math.random() * 1000);
		int aux1 = (int) (Math.random() * rua.length - 1);
		int aux2 = (int) (Math.random() * cidade.length - 1);
		return rua[aux1] + " " + numero + " - " + cidade[aux2];
	}
}