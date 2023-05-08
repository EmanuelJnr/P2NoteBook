package Aula03_05;

public abstract class Unidade {
	private int pontosDeVida;
	
	public void receberDano() {
		this.pontosDeVida--;
	}
	public boolean isVivo() {
		if(this.pontosDeVida>0) {
			return true;
		}
		return false;
	}
	/*public abstract boolean ganhaQuandoAtkPor(Unidade u) {
		if(this.tipo.equals(u.getTipo())) {
			this.pontosDeVida--;
			u.setPontosDeVida(u.getPontosDeVida()-1);
			return false;
		}
		if(u.getTipo().equals("catapulta") && this.tipo.equals("infantaria")) {
			this.pontosDeVida--;
			return false;
		}
		else if(u.getTipo().equals("infantaria") && this.tipo.equals("catapulta")) {
			u.setPontosDeVida(u.getPontosDeVida()-1);
			return true;
		}
		else if(u.getTipo().equals("cavalaria") && this.tipo.equals("catapulta")) {
			this.pontosDeVida--;
			return false;
		}
		else if (u.getTipo().equals("catapulta") && this.tipo.equals("cavalaria")) {
			u.setPontosDeVida(u.getPontosDeVida()-1);
			return true;
		}
		else if(u.getTipo().equals("infantaria") && this.tipo.equals("cavalaria")) {
			this.pontosDeVida--;
			return false;
		}
		else {
			u.setPontosDeVida(u.getPontosDeVida()-1);
			return true;
		}
	}*/
	public int getPontosDeVida() {
		return pontosDeVida;
	}
	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}
}