package AulaArray;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[10];
		
		System.out.println("Digite 10 números:");
		for(int i=0;i<vetor.length;i++)
			vetor[i] = input.nextInt();
		
		System.out.print("Ordem original: ");
		for(int n:vetor)
			System.out.print(n+", ");
		System.out.println("");
		System.out.print("Ordem inversa: ");
		for(int i=vetor.length-1;i>=0;i--)
			System.out.print(vetor[i]+", ");
		System.out.println("");
		System.out.print("Todos os pares: ");
		for(int n:vetor) {
			if(n%2==0)
				System.out.print(n+", ");
		}
		System.out.println("");
		System.out.print("Todos os ímpares: ");
		for(int n:vetor) {
			if(n%2==1)
				System.out.print(n+", ");
		}
		int soma=0;
		for(int i=1;i<=vetor.length-1;i++) {
			if(i%2==1)
				soma+=vetor[i];
		}
		System.out.println("");
		System.out.println("Soma dos índices ímpares: "+soma);
		int maior = vetor[0];
		int menor = vetor[0];
		for(int i=1;i<=vetor.length-1;i++) {
			if(vetor[i]>maior)
				maior=vetor[i];
			else
				menor=vetor[i];
		}
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
		
		input.close();
	}
}