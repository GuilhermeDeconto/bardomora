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
		Cliente c5 = new Cliente("Lucindo", "01531075029", 20, "M");
		Cliente c6 = new Cliente("Ademir", "4676900545", 20, "M");
		Cliente c7 = new Cliente("Julio", "01531075029", 20, "M");
		Cliente c8 = new Cliente("Alicia", "4676900545", 20, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(6, b.publicoMasculino());
	}

	@Test
	public void testaQuantidadeDeMulheres() {
		Cliente c5 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c7 = new Cliente("Nicole", "01531075029", 22, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 19, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(5, b.publicoFeminino());
	}

	@Test
	public void testaPublicSocio() {
		Cliente c5 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c6 = new Socio("Maria Lucia", "4676900545", 27, "F", 056);
		Cliente c7 = new Socio("Nicole", "01531075029", 22, "F", 002);
		Cliente c8 = new Socio("Maria", "4676900545", 19, "F", 334);
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(4, b.publicoSocio());
	}

	@Test
	public void testaPublicoNaoSocio() {
		Cliente c5 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c7 = new Cliente("Nicole", "01531075029", 22, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 19, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(7, b.publicoNormal());
	}

	@Test
	public void testaPercentualDeMulheres() {
		Cliente c5 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c7 = new Cliente("Nicole", "01531075029", 22, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 19, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(63, b.percentMulheres());
	}

	@Test
	public void testaPercentualDeHomens() {
		Cliente c5 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c7 = new Cliente("Nicole", "01531075029", 22, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 19, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(38, b.percentHomens());
	}

	@Test
	public void testaPercentualDeSocios() {
		Cliente c5 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c7 = new Cliente("Nicole", "01531075029", 22, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 19, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(13, b.percentSocios());
	}

	@Test
	public void testaPercentualDeNaoSocios() {
		Cliente c5 = new Socio("Lucinda", "01531075029", 26, "F", 109);
		Cliente c6 = new Cliente("Maria Lucia", "4676900545", 27, "F");
		Cliente c7 = new Cliente("Nicole", "01531075029", 22, "F");
		Cliente c8 = new Cliente("Maria", "4676900545", 19, "F");
		b.entrada(c5);
		b.entrada(c6);
		b.entrada(c7);
		b.entrada(c8);
		assertEquals(88, b.percentNormal());
	}
	
	@Test
	public void testaToString(){
		String msg=b.toString();
		assertEquals(msg, b.toString());
	}
	
}
