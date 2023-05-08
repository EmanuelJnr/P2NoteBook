package Lab26_04;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaGeometria {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Retangulo> retangulos = new ArrayList<>();
		ArrayList<Circulo> circulos = new ArrayList<>();
		ArrayList<Triangulo> triangulos = new ArrayList<>();
		
		System.out.println("Quantas formas você deseja criar? ");
		int qtd = Integer.parseInt(input.nextLine());
		
		for(int i=0;i<qtd;i++) {
			System.out.println("1-Retângulo 2-Círculo 3-Triangulo: ");
			String opc = input.nextLine();
			
			if(opc.equals("1")) {
				System.out.println("Digite a altura: ");
				float alt = Float.parseFloat(input.nextLine());
				System.out.println("Digite a base: ");
				float base = Float.parseFloat(input.nextLine());
				
				retangulos.add(new Retangulo(alt, base));
			}
			else if(opc.equals("2")) {
				System.out.println("Digite o raio: ");
				float raio = Float.parseFloat(input.nextLine());
				
				circulos.add(new Circulo(raio));
			}
			else if(opc.equals("3")) {
				System.out.println("Digite o primeiro lado: ");
				float lado1 = Float.parseFloat(input.nextLine());
				System.out.println("Digite o segundo lado: ");
				float lado2 = Float.parseFloat(input.nextLine());
				System.out.println("Digite o terceiro lado: ");
				float lado3 = Float.parseFloat(input.nextLine());
				
				triangulos.add(new Triangulo(lado1, lado2, lado3));
			}
		}
		for (Retangulo ret : retangulos) {
			System.out.println(ret.area());
			System.out.println(ret.perimetro());
		}
		for (Circulo cir : circulos) {
			System.out.println(cir.area());
		}
		for (Triangulo tri : triangulos) {
			System.out.println(tri.area());
			System.out.println(tri.perimetro());
		}
		System.out.println("Tem "+retangulos.size()+" Retângulos");
		System.out.println("Tem "+circulos.size()+" Círculos");
		System.out.println("Tem "+triangulos.size()+" Triângulos");
		input.close();
	}
}