package Aula03_05;

public class Catapulta extends Unidade{
	private int pontosDeVida;
	
	public Catapulta() {
		setPontosDeVida(3);
	}
	public int getPontosDeVida() {
		return pontosDeVida;
	}
	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
}