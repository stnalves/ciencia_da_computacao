package stefany_alves_prova1;

import java.util.ArrayList;

public class RepareBem {
	private ArrayList<Reparo> reparos; //100
	private ArrayList<OrdemDeServico> servicos; //500
	private int iOS;
	
	public RepareBem() {
		this.reparos = new ArrayList<>();
		this.servicos = new ArrayList<>();
		this.iOS = 0;
	}
	
	public void cadastrarReparo(String id, String descricao, double preco) {
		for (Reparo r: reparos) {
			if (r.getId().equals(id)) {
				throw new IllegalArgumentException("Reparo já cadastrado");
			}
		}
		
		Reparo reparo = new Reparo(id, descricao, preco);
		reparos.add(reparo);	
	}
	
	public void reajustarPrecoReparo(String idReparo, double percentual) {
		for (Reparo r: reparos) {
			if (r.getId().equals(idReparo)) {
				r.reajustarPreco(percentual);
				return;
			}
		}
		throw new IllegalArgumentException("Reparo inexistente");
	}
	
	public int cadastrarOrdemDeServico(String cliente, String telefone, String roupa) {
		iOS++;
		OrdemDeServico os = new OrdemDeServico(iOS, cliente, telefone, roupa);
		servicos.add(os);
		return iOS;
	}
	
	public String exibirOrdemDeServico(int idOS) {
		OrdemDeServico os = buscarOS(idOS);
		return os.toString();
	}
	
	public void incluirReparoOrdemDeServico(int idOS, String idReparo) {
		OrdemDeServico os = buscarOS(idOS);
		
		for (Reparo r: reparos) {
			if (r.getId().equals(idReparo)) {
				os.incluirReparo(r);
				return;
			}
		}
		throw new IllegalArgumentException("Reparo inexistente");
	}
	
	public void mudarStatus(int idOS, String status) {
		OrdemDeServico os = buscarOS(idOS);
		os.atualizarStatus(status);
	}
	
	public double obterValorOrdemServico(int idOS) {
		OrdemDeServico os = buscarOS(idOS);
		return os.obterValorTotal();
	}
	
	public String listarOrdemDeServico(String status) {
		String out = "";
	
		if (haStatus(status)) {
			out += "Ordens de Serviço - " + status + "\n";
			for (OrdemDeServico os: servicos) {
				out += os.toString() + "\n";
			} return out;
		}
		return "Não há ordens de serviço do tipo " + status;
	}
	
	private boolean haStatus(String status) {
		for (OrdemDeServico os: servicos) {
			if (os.getStatus() == status) {
				return true;
			}
		}
		return false;
	}
	
	public String listarOrdemDeServico() {
		String out = "Ordens de Serviço\n";
		for (OrdemDeServico os: servicos) {
			out += os.toString() + "\n";
		}
		return out;
	}
	
	private OrdemDeServico buscarOS(int idOS) {
		for (OrdemDeServico os: servicos) {
			if (os.getId() == idOS) {
				return os;
			}
		}
	throw new IllegalArgumentException("Ordem de serviço inexistente");
	}

}
