package model;

public class Pessoa
{

	private String nome;
	private String telefone;
	private String endereco;
	private String tipo;
	private int codArea;
		
	//Pede o atributo nome
	public String getNome()
	{
		return nome;
	}
	//Seta o nome
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	//Pede o atributo telefone
	public String getTelefone()
	{
		return telefone;
	}
	//seta o telefone
	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}
	//Pede o atributo endereço
	public String getEndereco()
	{
		return endereco;
	}
	//seta o endereço
	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}
	//Pede o atributo tipo de telefone
	public String getTipo()
	{
		return tipo;
	}
	//seta o tipo de telefone
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	//Pede o o código de área do telefone
	public int getCodArea() 
	{
		return codArea;
	}
	//Seta o código de área do telefone
	public void setCodArea(int codArea) 
	{
		this.codArea = codArea;
	}
	
}