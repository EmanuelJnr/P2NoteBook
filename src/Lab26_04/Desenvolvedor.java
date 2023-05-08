package Lab26_04;

public class Desenvolvedor extends Funcionario{
	public float calcularSalario(float salario) {
		if(salario>2000) {
			return (float) (salario - salario*0.15);
		}
		else {
			return (float) (salario - salario*0.10);
		}
	}
}