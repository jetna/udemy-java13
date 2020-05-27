package fundamentos;

public class Temperatura {
	public static void main(String[] args) {

		double fahrenheit=86;
		final int trintaedois = 32;
		final double umoito = 1.8;
		
		double celsius= (fahrenheit-trintaedois)/umoito;
		String s = "--Temperatura--";
		s = s.toUpperCase();
		System.out.println(s);
		System.out.println("Celsius: "+celsius);
			
	}

	
	
	//recebe fahrenheit; faz cálculo //
}
