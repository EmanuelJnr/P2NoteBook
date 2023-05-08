package Lab08_03;

public class Pessoa {

	private String nome;
	private String sexo;
	private float peso;
	private int altura;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public float getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String n) {
		nome=n;
	}
	public void setSexo(String s) {
		sexo=s;
	}
	public void setPeso(float p) {
		peso=p;
	}
	public void setAltura(int a) {
		altura=a;
	}
	public void setIdade(int i) {
		idade=i;
	}
}