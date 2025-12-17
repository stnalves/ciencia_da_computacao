package stefany_alves_prova1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrdemDeServicoTest {
	
	private OrdemDeServico os;

	@BeforeEach
	void preparaOrdemDeServico() {
		this.os = new OrdemDeServico(1, "Maria Helena", "9999999", "calça");
	}
	
	@Test
	void testStatusInicial() {
		assertEquals("Não iniciada", os.getStatus());
	}
	
	@Test
	void testMudarStatusAndamento() {
		os.atualizarStatus("Em andamento");
		assertEquals("Em andamento", os.getStatus());
	}

	@Test
	void testMudarStatusConcluida() {
		os.atualizarStatus("Concluída");
		assertEquals("Concluída", os.getStatus());
	}
}
