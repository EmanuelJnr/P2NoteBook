package Lab08_03;

public class CalculadoraDeCalorias {
	int total;
	public int caucularTaxaDeMetabolismoBasal(Pessoa pes) {
		if (pes.getSexo().equalsIgnoreCase("Mulher")) {
			total=(int) (655.1+(9.5*pes.getPeso())+(1.8*pes.getAltura())-(4.7*pes.getIdade()));
		} if (pes.getSexo().equalsIgnoreCase("Homem")) {
			total=(int) (66.1+(13.8*pes.getPeso())+(5*pes.getAltura())-(6.8*pes.getIdade()));
		}
		return total;
	}
}