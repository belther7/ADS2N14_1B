package app;

import view.ContaComum;
import view.SistemaBancarioView;

public class SistemaBancario
{
	public static void main(String[] args)
	{
		SistemaBancarioView sist = new SistemaBancarioView();

		sist.welcome();
		sist.printConta();
				
		ContaComum contaC = new ContaComum();
		
		ContaComum.menuContaComum();
	}
}