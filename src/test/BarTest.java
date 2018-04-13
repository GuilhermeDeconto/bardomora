package test;

import business.Bar;
import org.junit.Before;
import org.junit.Test;
import persistence.Cliente;
import persistence.Socio;

import static org.junit.Assert.assertEquals;

public class BarTest {
	private Bar b;

	@Before
	public void setUp() throws Exception {
		b = new Bar();
		Cliente c1 = new Cliente("Vitor Luiz", "98261823713", 22, "M");
		Cliente c2 = new Cliente("Alicia", "42365375458", 25, "F");
		Cliente c3 = new Cliente("Yuri","16786254901",30,"M");
		Cliente c4 = new Cliente("Joao","15627314614",69,"M");
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
	}

	@Test
	public void testaSaidaCliente() {
		b.saidaCliente("16786254901");
		assertEquals(3, b.publico());
	}

	@Test
	public void testaPublico() {
		Cliente c1 = new Cliente("Vitor Luiz", "98261823713", 22, "M");
		Cliente c2 = new Cliente("Alicia", "42365375458", 25, "F");
		Cliente c3 = new Cliente("Yuri","16786254901",30,"M");
		Cliente c4 = new Cliente("Joao","15627314614",69,"M");
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		assertEquals(8, b.publico());
	}

	@Test
	public void testaSaidaClienteInvalido() {
		assertEquals(false, b.saidaCliente("123"));
	}

	@Test
	public void testaBuscaCliente() {
		Cliente cb = b.getClientePorCPF("98261823713");
		assertEquals(cb, b.getClientePorCPF("98261823713"));
	}

	@Test
	public void testaBuscaClienteInvalido() {
		assertEquals(null, b.getClientePorCPF("54"));
	}

	@Test
	public void testaQuantidadeDeHomens() {
		Cliente c1 = new Cliente("Lucindo", "01531075029", 20, "M");
		Cliente c2 = new Cliente("Ademir", "4676900545", 20, "M");
		Cliente c3 = new Cliente("Julio", "16786254901", 20, "M");
		Cliente c4 = new Cliente("Alicia", "15627314614", 20, "F");
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		assertEquals(6, b.publicoMasculino());
	}

	@Test
	public void testaQuantidadeDeMulheres() {
		Cliente c1 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c2 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c3 = new Cliente("Nicole", "16786254901", 22, "F");
		Cliente c4 = new Cliente("Maria", "15627314614", 19, "F");
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		assertEquals(5, b.publicoFeminino());
	}

	@Test
	public void testaPublicSocio() {
		Cliente c1 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c2 = new Socio("Maria Lucia", "4676900545", 27, "F", 056);
		Cliente c3 = new Socio("Nicole", "16786254901", 22, "F", 002);
		Cliente c4 = new Socio("Maria", "15627314614", 19, "F", 334);
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		assertEquals(4, b.publicoSocio());
	}

	@Test
	public void testaPublicoNaoSocio() {
		Cliente c1 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c2 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c3 = new Cliente("Nicole", "16786254901", 22, "F");
		Cliente c4 = new Cliente("Maria", "15627314614", 19, "F");
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		assertEquals(7, b.publicoNormal());
	}

	@Test
	public void testaPercentualDeMulheres() {
		Cliente c1 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c2 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c3 = new Cliente("Nicole", "16786254901", 22, "F");
		Cliente c4 = new Cliente("Maria", "15627314614", 19, "F");
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		assertEquals(63, b.percentMulheres());
	}

	@Test
	public void testaPercentualDeHomens() {
		Cliente c1 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c2 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c3 = new Cliente("Nicole", "16786254901", 22, "F");
		Cliente c4 = new Cliente("Maria", "15627314614", 19, "F");
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		assertEquals(38, b.percentHomens());
	}

	@Test
	public void testaPercentualDeSocios() {
		Cliente c1 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c2 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c3 = new Cliente("Nicole", "16786254901", 22, "F");
		Cliente c4 = new Cliente("Maria", "15627314614", 19, "F");
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		assertEquals(13, b.percentSocios());
	}

	@Test
	public void testaPercentualDeNaoSocios() {
		Cliente c1 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c2 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c3 = new Cliente("Nicole", "16786254901", 22, "F");
		Cliente c4 = new Cliente("Maria", "15627314614", 19, "F");
		b.entrada(c1);
		b.entrada(c2);
		b.entrada(c3);
		b.entrada(c4);
		assertEquals(88, b.percentNormal());
	}
	
	@Test
	public void testaToString(){
		String msg=b.toString();
		assertEquals(msg, b.toString());
	}
	
}
