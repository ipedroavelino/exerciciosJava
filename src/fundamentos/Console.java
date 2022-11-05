package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		//Print sem quebra de linha
		System.out.print("Bom");
		System.out.print("Dia\n");
		
		//Print com quebra de linha 
		System.out.println("Bom");
		System.out.println("Dia");
		
		//Print com String formatada
		System.out.printf("Megasena: %d %d %d %d", 1,2,3,4);
	
		System.out.printf("\nSalario: %.1f", 1234.56);

		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("\nOla %s %s de %d anos", nome,sobrenome,idade);
	
		entrada.close();
	}
}
