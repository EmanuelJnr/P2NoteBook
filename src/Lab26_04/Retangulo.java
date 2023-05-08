package Lab26_04;

public class Retangulo extends FormaGeometrica{
	private float altura;
	private float base;
	
	public Retangulo(float altura, float base) {
		setAltura(altura);
		setBase(base);
	}
	
	public float area() {
		return base*altura;
	}
	public float perimetro() {
		return 2*(altura+base);
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
}