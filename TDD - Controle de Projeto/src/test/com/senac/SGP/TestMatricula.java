package test.com.senac.SGP;
import static org.junit.Assert.*;

import org.junit.Test;

import com.senac.SGP.Cargo;
import com.senac.SGP.Funcionario;
import com.senac.SGP.Pessoa;

public class TestMatricula
{
	@Test
	public void testMatricula()
	{
		// Preparar ambiente
		Pessoa pessoa = new Pessoa();
		Cargo cargo = new Cargo();
		Funcionario funcionario = new Funcionario(pessoa,cargo, 2500);
		
		// Executar operacoes
		
		// Avaliar Resultado

		assertEquals(1001, funcionario.getMatricula());
		assertEquals(2500, funcionario.getSalario());
		assertEquals(cargo, funcionario.getCargo());
	}
}