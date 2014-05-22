import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteEntrada
{
	public void carregarDados() throws IOException
	{
		InputStream is = new FileInputStream("Dados.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String aux = br.readLine();
		System.out.println(aux);		
		br.close();
	}
}
