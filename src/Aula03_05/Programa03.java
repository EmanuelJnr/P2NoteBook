package Aula03_05;

import java.util.Scanner;

public class Programa03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dinheiro = 1200;
		

		while(dinheiro>=50) {
			System.out.println("Infantaria 50, Cavalaria 100 e catapulta 200");
			String escolha = input.nextLine().toLowerCase();

			if(escolha.equals("infantaria")) {
				dinheiro-=50;
			}
			else if(escolha.equals("cavalaria") && dinheiro>=100){
				dinheiro-=100;
			}
			else if(escolha.equals("catapulta")&& dinheiro>=200) {
				dinheiro-=200;
			}
		}



		input.close();
	}
}
