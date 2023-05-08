package CopiaDomino;

public class Jogo {
	private Domino[] pecas = new Domino[28];
	private int indicePecaPuxada=0;
	
	public Jogo() {
		criarPecas();
		embaralharPecas();
	}
	public void criarPecas() {
		pecas[0] = new Domino(0, 0);
		pecas[1] = new Domino(0, 1);
		pecas[2] = new Domino(0, 2);
		pecas[3] = new Domino(0, 3);
		pecas[4] = new Domino(0, 4);
		pecas[5] = new Domino(0, 5);
		pecas[6] = new Domino(0, 6);
		pecas[7] = new Domino(1, 1);
		pecas[8] = new Domino(1, 2);
		pecas[9] = new Domino(1, 3);
		pecas[10] = new Domino(1, 4);
		pecas[11] = new Domino(1, 5);
		pecas[12] = new Domino(1, 6);
		pecas[13] = new Domino(2, 2);
		pecas[14] = new Domino(2, 3);
		pecas[15] = new Domino(2, 4);
		pecas[16] = new Domino(2, 5);
		pecas[17] = new Domino(2, 6);
		pecas[18] = new Domino(3, 3);
		pecas[19] = new Domino(3, 4);
		pecas[20] = new Domino(3, 5);
		pecas[21] = new Domino(3, 6);
		pecas[22] = new Domino(4, 4);
		pecas[23] = new Domino(4, 5);
		pecas[24] = new Domino(4, 6);
		pecas[25] = new Domino(5, 5);
		pecas[26] = new Domino(5, 6);
		pecas[27] = new Domino(6, 6);
	}
	public void embaralharPecas() {
		indicePecaPuxada=0;
		for(int i=0;i<100;i++) {
			int p1=(int) (Math.random()*pecas.length);
			int p2=(int) (Math.random()*pecas.length);
			while(p1==p2)
				p2=(int) (Math.random()*pecas.length);
			Domino aux = pecas[p1];
			pecas[p1] = pecas[p2];
			pecas[p2] = aux;
		}
	}
	public Domino puxarPeca() {
		if(indicePecaPuxada==28)
			return null;
		return pecas[indicePecaPuxada++];
	}
}