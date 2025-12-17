package stefany_alves_prova1;

import java.util.Objects;

public class Reparo {
	private String id;
	private String descricao;
	private double preco;
	
	public Reparo(String id, String descricao, double preco) {
		this.id= id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public void reajustarPreco(double percentual) {
		this.preco +=  this.preco * (percentual / 100);
	}

	public double getPreco() {
		return preco;
	}
	
	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reparo other = (Reparo) obj;
		return Objects.equals(id, other.id);
	}
}
