package Lab08_03;

public class AtendenteDeEnfermaria {
	boolean ver;
	public boolean avaliarDoador(Pessoa p,boolean x,boolean y) {
		if (p.getIdade()>18 && p.getIdade()<70 ) {
			if (p.getPeso()>49) {
				if(!x){
					if (!y) {
						ver= true;
					}
				}
			} else {
				ver=false;
			}
		}
		return ver;
	}
}