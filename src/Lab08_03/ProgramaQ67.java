package Lab08_03;

import java.util.Scanner;

public class ProgramaQ67 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa pes = new Pessoa();
		CalculadoraDeCalorias cal = new CalculadoraDeCalorias();
		
		System.out.println("Você é homem ou mulher: ");
		pes.setSexo(input.nextLine());
		System.out.println("Qual sua idade: ");
		pes.setIdade(input.nextInt());
		System.out.println("Qual o seu peso: ");
		pes.setPeso(input.nextFloat());
		System.out.println("Qual a sua altura: ");
		pes.setAltura(input.nextInt());
		
		System.out.println("A sua TMB é: "+cal.caucularTaxaDeMetabolismoBasal(pes));
		
		input.close();
	}
}