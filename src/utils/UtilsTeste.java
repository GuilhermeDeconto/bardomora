package utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilsTeste {

	@Test
	public void testeVerificaPorcentagem() {
		int aux = 0;
		aux = Utils.verificaPorcentagem(154, 154);
		assertEquals(100, aux);
		aux = Utils.verificaPorcentagem(154, 147);
		assertEquals(95, aux);
		aux = Utils.verificaPorcentagem(154, 139);
		assertEquals(90, aux);
		aux = Utils.verificaPorcentagem(154, 57);
		assertEquals(37, aux);
		aux = Utils.verificaPorcentagem(154, 74);
		assertEquals(48, aux);
		aux = Utils.verificaPorcentagem(154, 1);
		assertEquals(0, aux);
		aux = Utils.verificaPorcentagem(154, 4);
		assertEquals(2, aux);
	}
	
}
