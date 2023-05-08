package Lab08_03;

public class Porteiro {
	String texto;
	public String boasVindas(Pessoa pes) {
		if (pes.getIdade() < 10) {
			return "Olá jovem "+pes.getNome();
		}
		switch (pes.getSexo()) {
			case "homem":
			case "Homem":
				texto = "Bem vindo Senhor "+pes.getNome();
			break;
			case "mulher":
			case "Mulher":
				texto = "Bem vindo Senhorita "+pes.getNome();
			break;
			default:
				texto = "Olá "+pes.getNome()+", tenha um ótimo dia.";
		}
		return texto;
	}
}