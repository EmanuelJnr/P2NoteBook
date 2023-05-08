package Lab08_03;

import java.util.Scanner;

public class ProgramaQ45 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa p1 =new Pessoa();
		Pessoa p2 =new Pessoa();
		
		System.out.println("Qual idade da primeira pessoa:");
		p1.setIdade(input.nextInt());
		System.out.println("Qual peso da primeira pessoa:");
		p1.setPeso(input.nextFloat());
		
		System.out.println("Qual idade da segunda pessoa:");
		p2.setIdade(input.nextInt());
		System.out.println("Qual peso da segunda pessoa:");
		p2.setPeso(input.nextFloat());
		
		AtendenteDeEnfermaria em = new AtendenteDeEnfermaria();
		System.out.println(p1.getNome()+" tatuagem no ultimo ano: ");
		boolean tatu1;
		if (input.nextLine().equalsIgnoreCase("sim"))
			tatu1 = true;
		else
			tatu1 = false;
		System.out.println(p1.getNome()+" Bebeu nas ultimas 12 horas: ");
		boolean bebeu1;
		if (input.nextLine().equalsIgnoreCase("sim"))
			bebeu1 = true;
		else
			bebeu1 = false;
		
		System.out.println(p2.getNome()+" tatuagem no ultimo ano: ");
		boolean tatu2;
		if (input.nextLine().equalsIgnoreCase("sim"))
			tatu2 = true;
		else
			tatu2 = false;
		System.out.println(p2.getNome()+" Bebeu nas ultimas 12 horas: ");
		boolean bebeu2;
		if (input.nextLine().equalsIgnoreCase("sim"))
			bebeu2 = true;
		else
			bebeu2 = false;
		
		int cont = 0;
		if (em.avaliarDoador(p1, tatu1, bebeu1)) {
			System.out.println(p1.getNome()+" Pode doar");
			cont++;
		}
		else
			System.out.println(p1.getNome()+" Não pode doar");
		
		if (em.avaliarDoador(p2, tatu2, bebeu2)) {
			System.out.println(p2.getNome()+" Pode doar");
			cont++;
		}
		else
			System.out.println(p2.getNome()+" Não pode doar");
		
		System.out.println("Puderam doar "+cont+" pessoas");
		
		input.close();
	}
}