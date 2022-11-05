package fundamentos;

public class Temperaturas {
	public static void main(String[] args) {
		int fahrenheit = 86;
		final double divisao = 5/9.0;
		final int formula = 32;
		
		double celsius = (fahrenheit - formula) * divisao;
		
		System.out.println("Celsius "+ celsius +" oC");;
	}
}
