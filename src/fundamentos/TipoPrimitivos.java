package fundamentos;

public class TipoPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipo numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 67897;
		long pontosAcumulados = 6000000000L;
		
		//Tipo numéricos reais 
		float salario = 11445.44F;
		double vendasAcumuladas = 2991797103.01;
		
		//Tipo booleano 
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens 
		System.out.println(numeroDeVoos/2);
		
		//Ponto por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": Ganha -> "+ salario);
		System.out.println("Ferias?"+ estaDeFerias);
		System.out.println("Status " + status);
	}
}
