package controller;

import java.util.ArrayList;
import java.util.Random;
import model.Cliente;

public class ClienteController
{
	private Cliente contato;
	Random gerador = new Random();
	
	public void criarContato()
	{
			contato = new Cliente();
			contato.setNome(randomNome());
			contato.setEndereco(geradorEndereco());
			contato.setFone(geradorFone());
	}

	public String geradorFone ()
	{
		int codArea=0;
		int fone=0;
		int controle=0;
		
		//Gerar o c�digo de �rea com 2 d�gitos
		while (codArea<10)
		{
			codArea=gerador.nextInt(99);
			if (codArea>=10)
			{
				break;
			}
		}
		
		//Gerar o N�mero de 2 d�gitos
		while (fone<10)
		{
			fone=gerador.nextInt(99);
			if (fone>=10)
			{
				//Gerar o N�mero de 4 d�gitos
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
		
		//Retorna o Telefone do contato
		return "("+codArea+") 32"+fone+"-"+controle;
	}
	
	public String randomNome ()
	{

		//Gerar Lista de Nomes
		ArrayList<String> listaNomes = new ArrayList<String>() ;
		listaNomes.add ("Alice");
		listaNomes.add ("Ayumi");
		listaNomes.add ("Azumi");
		listaNomes.add ("Dean");
		listaNomes.add ("Edward");
		listaNomes.add ("Goku");
		listaNomes.add ("Haruhi");
		listaNomes.add ("Natsume");
		listaNomes.add ("Mireille");
		listaNomes.add ("Sam");
		listaNomes.add ("Zwei");
		
		
		//Lista de Sobrenomes
		ArrayList<String> listaSobre = new ArrayList<String>() ;
		
		listaSobre.add ("Aoki");
		listaSobre.add ("Chei");
		listaSobre.add ("Endo");
		listaSobre.add ("Fritz");
		listaSobre.add ("Gorceix");
		listaSobre.add ("Heinz");
		listaSobre.add ("Klaus");
		listaSobre.add ("Morissette");
		listaSobre.add ("Ogawa");
		listaSobre.add ("Piccolo");
		listaSobre.add ("Sasaki");
		listaSobre.add ("Scarano");
		listaSobre.add ("Schneider");
		listaSobre.add ("Schumann");
		listaSobre.add ("Tomassi");
		listaSobre.add ("von Aaron");
		listaSobre.add ("Wzorek");
		listaSobre.add ("Zeiss");
		listaSobre.add ("Zanotti");
		listaSobre.add ("Z�rich");

		
		int numNome=gerador.nextInt(11);
		int numSobrenome=gerador.nextInt(20);
		int numSobrenome1=gerador.nextInt(20);
		
		return listaNomes.get(numNome)+" "+listaSobre.get(numSobrenome)+" "+listaSobre.get(numSobrenome1);	
	}

	public String geradorEndereco ()
	{
		
		//Lista de Tipos do Endere�o
		ArrayList<String> listaTipo = new ArrayList<String>() ;
		listaTipo.add ("Avenida");
		listaTipo.add ("Pra�a");
		listaTipo.add ("Rua");
		
		//Lista de Patente do Endere�o
		ArrayList<String> listaPatente = new ArrayList<String>() ;
		listaPatente.add ("Doutor");
		listaPatente.add ("Conde");
		listaPatente.add ("Brigadeiro");
		listaPatente.add ("Capit�o");
		listaPatente.add ("Coronel");
		listaPatente.add ("General");
		
		//Lista de Nomes do Endere�o
		ArrayList<String> listaNomes = new ArrayList<String>() ;
		
		listaNomes.add ("Ant�nio");
		listaNomes.add ("C�sio");
		listaNomes.add ("Cl�udio");
		listaNomes.add ("Donato");
		listaNomes.add ("Genu�no");
		listaNomes.add ("Get�lio");
		listaNomes.add ("Henri");
		listaNomes.add ("Jo�o");
		listaNomes.add ("Reinaldo");
		listaNomes.add ("Santo");
		listaNomes.add ("Saymon");
		
		//Lista de Sobrenomes do Endere�o
		ArrayList<String> listaSobre = new ArrayList<String>() ;
		
		listaSobre.add ("Alves");
		listaSobre.add ("Carmo");
		listaSobre.add ("de Lima");
		listaSobre.add ("Ferreira");
		listaSobre.add ("Galeon");
		listaSobre.add ("Harr");
		listaSobre.add ("Kyuss");
		listaSobre.add ("Massachusets");
		listaSobre.add ("Oliveira");
		listaSobre.add ("Pedro");
		listaSobre.add ("Rocha");
		listaSobre.add ("Samara");
		listaSobre.add ("Stephanie");
		listaSobre.add ("Svetlana");
		listaSobre.add ("Trinity");
		listaSobre.add ("Vicente");
		listaSobre.add ("Vougan");
		listaSobre.add ("Xerxes");
		listaSobre.add ("Zedekiah");
		listaSobre.add ("Zuriel");

		int numNome=gerador.nextInt(11);
		int numSobre=gerador.nextInt(20);
		int numPatente=gerador.nextInt(6);
		int numero=gerador.nextInt(1000);
		
		return listaPatente.get(numPatente)+" "+listaNomes.get(numNome)+" "+listaSobre.get(numSobre)+", "+numero;
	}

}