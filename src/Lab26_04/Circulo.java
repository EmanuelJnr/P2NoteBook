package Lab26_04;

public class Circulo extends FormaGeometrica{
	private float raio;

	public Circulo(float raio) {
		setRaio(raio);
	}
	
	public float area() {
		return (float) (Math.PI*(raio*raio));
	}
	public float perimetro() {
		return (float) (2*Math.PI*raio);
	}
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
}