package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
			
			int valor = -1;
			 
			while(valor == -1) {
				System.out.println("Voce diz: ");
				entrada.nextLine();
			}
		entrada.close();
	}
}
