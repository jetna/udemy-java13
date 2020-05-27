package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		//Usando Wrapper
		Integer num1 = 1000; //Integer wrapper
		System.out.println(num1.toString().length());
		
		
		//Usando tipo primitivo
		int num2=142;
		System.out.println(Integer.toString(num2).length());
		
	}
}
