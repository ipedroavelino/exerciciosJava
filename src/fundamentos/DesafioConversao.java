package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String valor1;
		String valor2;
		String valor3;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = entrada.next();//.replace
		
		System.out.println("Digite o segundo valor: ");
		valor2 = entrada.next();
		
		System.out.println("Digite o terceiro valor: ");
		valor3 = entrada.next();
		
		
		double numero1 = Double.parseDouble(valor1.replace(",", "."));
		double numero2 = Double.parseDouble(valor2.replace(",", "."));
		double numero3 = Double.parseDouble(valor3.replace(",", "."));
		
		double media = (numero1 + numero2 + numero3)/3;
		System.out.println("A média é :" + media);
		
		entrada.close();
	}
}
