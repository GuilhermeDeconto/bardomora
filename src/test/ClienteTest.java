package test;

import org.junit.Before;
import org.junit.Test;
import persistence.Cliente;

import static org.junit.Assert.assertEquals;

public class ClienteTest {

	private Cliente cl;

	@Before
	public void setUp() throws Exception {
		cl = new Cliente("Vitor Luiz", "98261823713", 22, "M");
	}

	@Test
	public void testaGetNome() {
		String nome = cl.getNome();
		assertEquals(nome, cl.getNome());
	}

	@Test
	public void testaSetNome() {
		cl.setNome("Vitória");
		String nome = cl.getNome();
		assertEquals(nome, cl.getNome());
	}

	@Test
	public void testaGetCPF() {
		String cpf = cl.getCpf();
		assertEquals(cpf, cl.getCpf());
	}

	@Test
	public void testaSetCPF() {
		cl.setCpf("12345");
		String cpf = cl.getCpf();
		assertEquals(cpf, cl.getCpf());
	}

	@Test
	public void testaGetIdade() {
		int idade = cl.getIdade();
		assertEquals(idade, cl.getIdade());
	}

	@Test
	public void testaSetIdade() {
		cl.setIdade(35);
		int idade = cl.getIdade();
		assertEquals(idade, cl.getIdade());
	}

	@Test
	public void testaGetGenero() {
		String genero = cl.getGenero();
		assertEquals(genero, cl.getGenero());
	}

	@Test
	public void testaSetGenero() {
		cl.setGenero("F");
		String genero = cl.getGenero();
		assertEquals(genero, cl.getGenero());
	}

	@Test
	public void testaToString() {
		String msg = cl.toString();
		assertEquals(msg, cl.toString());
	}

}
