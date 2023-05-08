package Aula03_05;

public class Cavalaria extends Unidade{
	private int pontosDeVida;
	
	public Cavalaria() {
		setPontosDeVida(2);
	}

	public boolean ganhaQuandoAtkPor(Unidade u) {
		if(this.getClass().equals(u.getClass())) {
			this.pontosDeVida--;
			u.setPontosDeVida(u.getPontosDeVida()-1);
			return false;
		}
		else if(this.getClass().equals(u.getClass().equals("Catapulta"))) {
			this.pontosDeVida--;
			return false;
		}
		else if (u.getClass().equals(this.getClass())) {
			u.setPontosDeVida(u.getPontosDeVida()-1);
			return true;
		}
	}
	public int getPontosDeVida() {
		return pontosDeVida;
	}
	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
}