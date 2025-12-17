package stefany_alves_prova1;

import java.util.ArrayList;

public class OrdemDeServico {
	private ArrayList<Reparo> reparos;
	private int id;
	private String cliente;
	private String roupa;
	private String telefone;
	private String status;

	public OrdemDeServico(int id, String cliente, String telefone, String roupa) {
		this.id = id;
		this.cliente = cliente;
		this.telefone = telefone;
		this.roupa = roupa;
		this.status = "Não iniciada";
		this.reparos = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public void incluirReparo(Reparo reparo) {
		if (reparos.size() == 10) {
			throw new IllegalArgumentException("Limite de reparos atingido");
		}
		reparos.add(reparo);
	}
	
	public void atualizarStatus(String status) {
		this.status = status;
	}
	
	public double obterValorTotal() {
		double total = 0;
		for (Reparo r: reparos) {
			total += r.getPreco();
		}
		return total;
	}
	
	public int getQntReparos() {
		return reparos.size();
	}

	@Override
	public String toString() {
		return "#" + id + 
				"; cliente:" + cliente + 
				"; roupa:" + roupa + 
				"; reparos:" + getQntReparos() + 
				"; total: R$" + obterValorTotal(); 
	}
}
