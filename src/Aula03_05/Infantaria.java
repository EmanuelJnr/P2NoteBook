package Aula03_05;

public class Infantaria extends Unidade{
	private int pontosDeVida;
	
	public Infantaria() {
		setPontosDeVida(1);
	}
	public int getPontosDeVida() {
		return pontosDeVida;
	}
	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
}