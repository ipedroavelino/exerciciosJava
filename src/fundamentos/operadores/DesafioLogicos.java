package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		//Dois trabalhos que podem ou não ser confirmados
		//se os dois trabalhos derem certo a TV de 50 polegadas será comprada
		//se apenas um dos trabalhos derem certo será comprada a TV de 32 polegas 
		//nos dois casos a familia tomara sorvete e ficará mais saudável
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50 ?" + comprouTv50);
		System.out.println("Comprou TV 32 ?" + comprouTv32);
		System.out.println("Comprou Sorvete ?" + comprouSorvete);
		System.out.println("Mais saudavel ?" + maisSaudavel);
		}
}
