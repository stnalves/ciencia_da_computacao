package KingOfTokyo;

public class Personagem {
    // Atributos
    private String nome;
    private int vida;
    private int estrela;
    private int energia;

    // Construtor
    public Personagem(String nomeDoPersonagem) {
        this.nome = nomeDoPersonagem;
        this.vida = 10;
        this.estrela = 0;
        this.energia = 0;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int valorVida) {
        this.vida += valorVida;
        if (this.vida > 10) {
            this.vida = 10;
        }
    }

    public int getEstrela() {
        return vida;
    }

    public void setEstrela(int valorEstrela) {
        this.estrela += valorEstrela;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int valorEnergia) {
        this.energia += valorEnergia;
    }

    //toString
    public String toString() {
        return getNome() + " " + getVida() + " " + getEstrela() + " " + getEnergia();
    }

    //ataque e cura
    public void atacar(Personagem vitima, int dano) {
        int novaVida = vitima.getVida() - dano;
        if (novaVida < 0) {
            novaVida = 0;
        }
        vitima.setVida(novaVida);
    }

    public void curar(int valorVida) {
        this.setVida(this.getVida() + valorVida);
    }
}
