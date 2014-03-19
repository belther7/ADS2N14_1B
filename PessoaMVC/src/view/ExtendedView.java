package view;

import static java.lang.System.out;
//mostra o contato completo
public class ExtendedView extends ContatoView 
{
	public void printContato(String nome, String telefone, String endereco, String tipo, int codArea)
	{
		out.println("Nome: "+nome);
		out.println("Tipo de Telefone: "+tipo+" Número: "+telefone);
		out.println("Endereco: "+endereco);
	}

}