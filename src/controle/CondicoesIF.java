package controle;

import java.util.Scanner;

public class CondicoesIF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a media: ");
		double media = entrada.nextDouble();
		
		if(media<=10 && media>6.0){
			System.out.println("Aprovado");
		}
		
		if(media<7 && media>=4.5){
			System.out.println("Recuperação");
		}
		boolean criterioReprovacaoAtingido = media<4.5 && media>=0;
		if(criterioReprovacaoAtingido) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}
