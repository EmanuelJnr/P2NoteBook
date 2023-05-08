package AulaArray;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Contato[] contatos = new Contato[5];
		for(int i=0;i<5;i++) {
			Contato c = new Contato();
			System.out.print("Digite o nome ["+i+"]: ");
			c.setNome(input.nextLine());
			System.out.print("Digite o telefone ["+i+"]: ");
			c.setTelefone(input.nextLine());
			System.out.print("Digite o tipo ["+i+"]: ");
			String tipo=input.nextLine().toUpperCase();
			c.setTipo(TipoContato.valueOf(tipo));
			contatos[i]=c;
		}
		System.out.println("CADASTRO FINALIZADO");
		int pos=0;
		do {
			System.out.print("Digite uma posição: ");
			pos = input.nextInt();
			if(pos >= 0 && pos < contatos.length)
				System.out.println(contatos[pos-1].getNome()+", "+contatos[pos-1].getTipo()+": "+contatos[pos-1].getTelefone());
			//else if()
			System.out.println("Índice inválido!");
		} while (pos!=-1);
		
		
		
		input.close();
	}
}