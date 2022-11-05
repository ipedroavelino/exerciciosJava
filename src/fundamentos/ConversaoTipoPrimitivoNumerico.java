package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1;//implícita
		System.out.println(a);
		
		//Conversão explícita CAST
		float b = (float)1.1234455666666;
		System.out.println(b);
		
		int c = 130;
		byte d = (byte)c;
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
	}
}
