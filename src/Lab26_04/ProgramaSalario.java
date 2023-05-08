package Lab26_04;

import java.util.Scanner;

public class ProgramaSalario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual a sua profissão: ");
		String prof = input.nextLine();
		System.out.println("Qual o seu salário: ");
		float sal = Float.parseFloat(input.nextLine());
		
		if(prof.equals("Desenvolvedor")){
			Desenvolvedor dev = new Desenvolvedor();
			System.out.println("Seu salário será: "+dev.calcularSalario(sal));
		}
		else if(prof.equals("Gerente")){
			Gerente ger = new Gerente();
			System.out.println("Seu salário será: "+ger.calcularSalario(sal));
		}
		else if(prof.equals("DBA")){
			DBA dba = new DBA();
			System.out.println("Seu salário será: "+dba.calcularSalario(sal));
		}
		
		input.close();
	}
}