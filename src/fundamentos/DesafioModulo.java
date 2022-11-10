package fundamentos;

import java.util.Scanner;

public class DesafioModulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

			System.out.print("Digite o número:" );
				double valor1 = entrada.nextDouble();

			System.out.print("Digite o número:" );
				double valor2 = entrada.nextDouble();

			System.out.print("Informe a operacao: ");
				String operadores = entrada.next();
			
			double resultado = "+".equals(operadores)? valor1 + valor2 : 0;
			 resultado = "-".equals(operadores)? valor1 - valor2 : resultado;
			 resultado = "*".equals(operadores)? valor1 * valor2 : resultado;
			 resultado = "/".equals(operadores)? valor1 / valor2 : resultado;
			 resultado = "%".equals(operadores)? valor1 % valor2 : resultado;
			
			 System.out.printf("%.2f %s %.2f = %.2f", valor1, operadores, valor2, resultado);
		entrada.close();
	}
}
