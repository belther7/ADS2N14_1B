package controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import model.Pessoa;
import view.ContatoView;

public class PessoaController
{
	private Pessoa contato;
	Random gerador = new Random();
	//criador de contato
	public void criarContato()
	{
		//gerador de 50 contatos
		for (int i=1;i<=50;i++)
		{
			contato = new Pessoa();
			contato.setNome(sorteiaNome());
			contato.setEndereco(geradorEndereco());
			contato.setTelefone(geradorTelefone());
			contato.setTipo(geraTipoTelefone());
		}
	}
	//método exibe que exibe o contato
	public void exibirContato(ContatoView view)
	{
		view.printContato(contato.getNome(), contato.getTelefone(), contato.getEndereco(), contato.getTipo(), contato.getCodArea());
	}
	//método gerador do tipo de telefone
	public String geraTipoTelefone()
	{
		int numTipo=gerador.nextInt(3);
		
		ArrayList<String> listaTipo = new ArrayList() ;
		listaTipo.add ("Celular");
		listaTipo.add ("Casa");
		listaTipo.add ("Trabalho");
		
		return listaTipo.get(numTipo);
	}
	//método gerador de telefone
	public String geradorTelefone ()
	{
		int codArea=0;
		int telefone=0;
		int controle=0;
		//gera o código de área, com 2 digitos
		while (codArea<10)
		{
			codArea=gerador.nextInt(99);
			if (codArea>=10)
			{
				break;
			}
		}
		//gera o numéro de 3 digitos
		while (telefone<100)
		{
			telefone=gerador.nextInt(999);
			if (telefone>=100)
			{
				//gera o numéro de 4 digitos
				while (controle<1000)
				{
					controle=gerador.nextInt(9999);
					if (controle>=1000)
					{
						break;
					}
				}
				
			}
		}
		//retorna o telefone do contato
		return "("+codArea+") "+telefone+"-"+controle;
	}
	//Gera o nome com sobrenome
	public String sorteiaNome ()
	{
		//Gera lista de nomes
		ArrayList<String> listaNomes = new ArrayList() ;
		listaNomes.add ("Alice");
		listaNomes.add ("Bruno");
		listaNomes.add ("Carlos");
		listaNomes.add ("Daniel");
		listaNomes.add ("Luciano");
		listaNomes.add ("João");
		listaNomes.add ("Carla");
		listaNomes.add ("Daniele");
		listaNomes.add ("Rosane");
		listaNomes.add ("Thiago");
		listaNomes.add ("Rafael");
		
		
		//Gera lista de sobrenomes
		ArrayList<String> listaSobreNomes = new ArrayList() ;
		listaSobreNomes.add ("Silva");
		listaSobreNomes.add ("Santos");
		listaSobreNomes.add ("Rodrigues");
		listaSobreNomes.add ("Martins");
		listaSobreNomes.add ("Mendes");
		listaSobreNomes.add ("Schneider");
		listaSobreNomes.add ("Oliveira");
		listaSobreNomes.add ("Schumann");
		listaSobreNomes.add ("Camara");
		listaSobreNomes.add ("Garbelotti");
		listaSobreNomes.add ("Nolasco");
		listaSobreNomes.add ("Danda");
		listaSobreNomes.add ("da Silva");
		listaSobreNomes.add ("dos Santos");
		listaSobreNomes.add ("Von Schumann");
		listaSobreNomes.add ("Smith");
		listaSobreNomes.add ("Schumacher");
		listaSobreNomes.add ("Braga");
		listaSobreNomes.add ("Fernandes");
		listaSobreNomes.add ("Cusato");
		listaSobreNomes.add ("Costa");
		
		
		int numNome=gerador.nextInt(11);
		int numSobreNome=gerador.nextInt(20);
		int numSobreNome1=gerador.nextInt(20);
		
		return listaNomes.get(numNome)+" "+listaSobreNomes.get(numSobreNome)+" "+listaSobreNomes.get(numSobreNome1);	
	}
	//gera o endereço
	public String geradorEndereco ()
	{
		//Gera tipo
		ArrayList<String> listaTipo = new ArrayList() ;
		listaTipo.add ("Avenida");
		listaTipo.add ("Praça");
		listaTipo.add ("Rua");
		
		//Gera lista de patente
		ArrayList<String> listaPatente = new ArrayList() ;
		listaPatente.add ("Doutor");
		listaPatente.add ("General");
		listaPatente.add ("Capitão");
		listaPatente.add ("Coronel");
		listaPatente.add ("Brigadeiro");
		
		//Gera lista de nomes
		ArrayList<String> listaNomes = new ArrayList() ;
		listaNomes.add ("Sonia");
		listaNomes.add ("Bento");
		listaNomes.add ("Vanderlei");
		listaNomes.add ("Wagner");
		listaNomes.add ("Getúlio");
		listaNomes.add ("Cassiano");
		listaNomes.add ("Voltaire");
		listaNomes.add ("Dorotéia");
		listaNomes.add ("Iago");
		listaNomes.add ("Thiago");
		listaNomes.add ("Rafael");
		
		//Gera lista de sobrenomes
		ArrayList<String> listaSobreNomes = new ArrayList() ;
		listaSobreNomes.add ("Silva");
		listaSobreNomes.add ("Santos");
		listaSobreNomes.add ("Rodrigues");
		listaSobreNomes.add ("Martins");
		listaSobreNomes.add ("Mendes");
		listaSobreNomes.add ("Schneider");
		listaSobreNomes.add ("Oliveira");
		listaSobreNomes.add ("Schumann");
		listaSobreNomes.add ("Camara");
		listaSobreNomes.add ("Garbelotti");
		listaSobreNomes.add ("Nolasco");
		listaSobreNomes.add ("Danda");
		listaSobreNomes.add ("da Silva");
		listaSobreNomes.add ("dos Santos");
		listaSobreNomes.add ("Von Schumann");
		listaSobreNomes.add ("Smith");
		listaSobreNomes.add ("Schumacher");
		listaSobreNomes.add ("Braga");
		listaSobreNomes.add ("Fernandes");
		listaSobreNomes.add ("Cusato");
		listaSobreNomes.add ("Costa");
		
		int numNome=gerador.nextInt(11);
		int numSobreNome=gerador.nextInt(20);
		int numPatente=gerador.nextInt(5);
		int numTipo=gerador.nextInt(3);
		int numero=gerador.nextInt(1000);
		
		return listaTipo.get(numTipo)+" "+listaPatente.get(numPatente)+" "+listaNomes.get(numNome)+" "+listaSobreNomes.get(numSobreNome)+", "+numero;
	}
}