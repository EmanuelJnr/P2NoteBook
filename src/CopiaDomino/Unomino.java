package CopiaDomino;

import java.util.Scanner;

public class Unomino {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Jogo j = new Jogo();
		int cont=0;
		boolean play = true;

		Domino pecaV = j.puxarPeca();
		Domino[] pecasU = new Domino[6];
		for(int i=0;i<pecasU.length;i++)
			pecasU[i]=j.puxarPeca();
		
		while(cont!=6 && play) {
			System.out.println("Peça da vez: "+pecaV);
			
			System.out.print("Peças na mão: {");
			for (Domino p : pecasU)
				System.out.print(p);
			System.out.println("}");
			System.out.print("Indique o índice da peça que deseja casar (0-5) ");
			int escolha = Integer.parseInt(input.nextLine());

			if(pecasU[escolha].validarJuncao(pecaV)) {
				System.out.println(pecasU[escolha]+" se conecta com "+pecaV);
				pecaV = pecasU[escolha];
				pecasU[escolha] = null;
				cont++;
			}
			else {
				System.out.println(pecasU[escolha]+" não se conecta com "+pecaV);
				System.out.print("Você perdeu. ");
				play = false;
			}
		}
		System.out.println("Fim de jogo.");
		System.out.println("Você fez "+cont+" pontos.");
		input.close();
	}
}