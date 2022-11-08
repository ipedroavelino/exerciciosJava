package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		
		//equals compara o conteúdo
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2"==s2.trim());
		System.out.println("2".equals(s2.trim()));
		//trim ignora espaços em branco
		
		entrada.close();
	}
}
