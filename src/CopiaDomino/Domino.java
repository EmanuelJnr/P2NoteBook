package CopiaDomino;

public class Domino {
	private int ladoA;
	private int ladoB;
	
	public Domino(int ladoA, int ladoB) {
		setLadoA(ladoA);
		setLadoB(ladoB);
	}
	public String toString() {
		return "["+ladoA+", "+ladoB+"]";
	}
	public boolean validarJuncao(Domino d) {
		if(ladoA==d.ladoA || ladoB==d.ladoB || ladoA==d.ladoB)
			return true;
		return false;
	}
	public int getLadoA() {
		return ladoA;
	}
	public void setLadoA(int ladoA) {
		if (ladoA>=0 && ladoA<=6)
			this.ladoA = ladoA;
	}
	public int getLadoB() {
		return ladoB;
	}
	public void setLadoB(int ladoB) {
		if (ladoB>=0 && ladoB<=6)
			this.ladoB = ladoB;
	}
	
}