package stefany_alves_prova1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReparoTest {
	
	private Reparo r;
	
	@BeforeEach
	void preparaReparo() {
		this.r = new Reparo("ZIP", "Troca de zíper", 100);		
	}
	
	@Test
	void testReajustarPrecoPositivo() {
		this.r.reajustarPreco(10);
		assertEquals(110, this.r.getPreco());
	}
	
	@Test
	void testReajustarProcoNegativo() {
		this.r.reajustarPreco(-20);
		assertEquals(80, this.r.getPreco());
	}
	
	@Test
	void testReajustarProcoZero() {
		this.r.reajustarPreco(0);
		assertEquals(100, this.r.getPreco());
	}
}
