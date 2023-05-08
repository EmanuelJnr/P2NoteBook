package AulaArray;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas linhas: ");
		int qtlinha = input.nextInt();
		System.out.print("Quantas colunas: ");
		int qtcolun = input.nextInt();
		
		int matriz[][] = new int[qtlinha][qtcolun];
		for(int i=0;i<=qtlinha-1;i++) {
			for(int j=0;j<=qtcolun-1;j++) {
				System.out.print("M ["+i+","+j+"] = ");
				matriz[i][j] = input.nextInt();
			}
		}
		System.out.println("Matriz:");
		for(int i=0;i<=matriz.length-1;i++) {
			for(int n:matriz[i])
				System.out.print(n+" ");
			System.out.println("");
		}
		int soma0 = matriz[0][0]+matriz[0][1];
		System.out.println("Soma da linha 0: "+soma0);
		int soma1 = matriz[1][0]+matriz[1][1];
		System.out.println("Soma da linha 1: "+soma1);
		if(qtlinha == qtcolun)
			System.out.println("É uma matriz quadrada!");
		else
			System.out.println("Não é uma matriz quadrada!");
		
		input.close();
	}
}