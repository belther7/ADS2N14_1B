import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteSaida
{
	public void gravarDados() throws IOException
	{
		OutputStream os = new FileOutputStream("Dados.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("Teste 9876543210");
		bw.close();
	}
}
