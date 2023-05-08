package Lab26_04;

public class Gerente {
	public float calcularSalario(float salario) {
		if(salario>3500) {
			return (float) (salario - salario*0.20);
		}
		else {
			return (float) (salario - salario*0.15);
		}
	}
}