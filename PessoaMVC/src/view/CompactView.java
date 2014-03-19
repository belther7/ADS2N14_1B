package view;

import static java.lang.System.out;
//mostra o contato compacto
public class CompactView extends ContatoView
{
	@Override
	public void printContato(String nome, String telefone, String endereco, String tipo, int codArea)
	{
		out.println(String.format("Contato: %s - %s %s", nome, tipo, telefone)+"\n");
	}

}