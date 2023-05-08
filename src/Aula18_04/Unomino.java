package Aula18_04;

import java.util.Scanner;

public class Unomino {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Jogo j = new Jogo();
		boolean play = true;
		
		Domino pecaV = j.puxarPeca();
		
		Domino[] pecasU = new Domino[6];
		for(int i=0;i<pecasU.length;i++)
			pecasU[i]=j.puxarPeca();
		
		Domino[] pecasU2 = new Domino[6];
		for(int i=0;i<pecasU2.length;i++)
			pecasU2[i]=j.puxarPeca();
		
		System.out.println("Peça sorteada para iniciar: "+pecaV);
		while(play) {
			System.out.println("Em jogo: Esquerda: "+pecaV.getLadoA());
			System.out.println("Direita: "+pecaV.getLadoB());
			System.out.print("Mão jogador 1: {");
			for (Domino p : pecasU)
				System.out.print(p);
			System.out.println("}");
			System.out.print("Indique o índice da peça que deseja casar (0-5) ");
			int escolha = Integer.parseInt(input.nextLine());
			System.out.println("Jogador 1 qual lado deseja conectar: ");
			String dir = input.nextLine();
			if(dir=="esquerdo") {
				if(j.conectarPontaEsq(pecasU[escolha])) {
					pecaV = pecasU[escolha];
					pecasU[escolha] = null;
				}	
			}
			else if(dir=="direito") {
				if(j.conectarPontaDir(pecasU[escolha])) {
					pecaV = pecasU[escolha];
					pecasU[escolha] = null;
				}	
			}
			else {
				System.out.println("Jogador 1 perdeu");
				break;
			}
			
			System.out.println("Em jogo: Esquerda: "+pecaV.getLadoA());
			System.out.println("Direita: "+pecaV.getLadoB());
			System.out.print("Mão jogador 2: {");
			for (Domino p : pecasU2)
				System.out.print(p);
			System.out.println("}");
			System.out.print("Indique o índice da peça que deseja casar (0-5) ");
			int escolha2 = Integer.parseInt(input.nextLine());
			System.out.println("Jogador 1 qual lado deseja conectar: ");
			String dir2 = input.nextLine();
			if(dir2=="esquerdo") {
				if(j.conectarPontaEsq(pecasU2[escolha])) {
					pecaV = pecasU2[escolha2];
					pecasU2[escolha2] = null;
				}	
			}
			else if(dir2=="direito") {
				if(j.conectarPontaDir(pecasU2[escolha2])) {
					pecaV = pecasU2[escolha2];
					pecasU2[escolha2] = null;
				}	
			}
			else {
				System.out.println("Jogador 1 perdeu");
				break;
			}
		}
		input.close();
	}
}