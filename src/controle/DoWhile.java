package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String texto = "por favor";
		
		do {
			System.out.println("Voce precisa falar as palavras mágicas...");
			System.out.println("Quer sair ?");
			texto = entrada.nextLine();
		}
		while(texto.equalsIgnoreCase("Obrigado"));

		System.out.println("Obrigado ");
		entrada.close();
	}
}
