package Lab08_03;

import java.util.Scanner;

public class ProgramaQ123 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa pes = new Pessoa();
		Porteiro por = new Porteiro();
		
		System.out.println("Qual o seu nome: ");
		pes.setNome(input.nextLine());
		System.out.println("Você é homem ou mulher: ");
		pes.setSexo(input.nextLine());
		System.out.println("Qual sua idade: ");
		pes.setIdade(input.nextInt());
		
		System.out.println(por.boasVindas(pes));
		
		input.close();
	}
}