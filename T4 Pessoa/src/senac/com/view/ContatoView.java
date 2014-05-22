package senac.com.view;

import com.senac.contato.Pessoa;
import com.senac.controller.ContatoController;
import com.senac.controller.GerarAleatorio;
import com.senac.data.ContatoSalvar;

public class ContatoView
{
	private String nomeAleatorio;
	private String EnderecoAleatorio;
	private String numeroAleatorio;
	private String tipoAleatorio;
	private ContatoController contato;
	
	public ContatoView()
	{

	}

	public ContatoController getContato()
	{
		return contato;
	}

	public void setContato(ContatoController contato)
	{
		this.contato = contato;
	}

	public static void main(String[] args)
	{
		GerarAleatorio gerar = new GerarAleatorio();
		ContatoSalvar novoContato = new ContatoSalvar("dados.txt");

		for (int i = 0; i <= 20; i++)
		{
			int aux = (int)(Math.random() * 1000);
			novoContato.gravar(Integer.toString(aux));
			novoContato.gravar("\n");
			novoContato.gravar(Integer.toString(100));
			novoContato.gravar("\n");
			novoContato.gravar(gerar.gerarNomeAleatorio());
			novoContato.gravar("\n");
			novoContato.gravar(gerar.gerarNumeroAleatorio());
			novoContato.gravar("\n");
			novoContato.gravar(gerar.gerarTipoTelefoneAleatorio());
			novoContato.gravar("\n");
			novoContato.gravar(gerar.gerarEndereco());
			novoContato.gravar("\n");
		}
		novoContato.close();
	}
}