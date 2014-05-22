import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		TesteSaida saida = new TesteSaida();
		TesteEntrada entrada = new TesteEntrada();
		saida.gravarDados();
		entrada.carregarDados();
	}
}
