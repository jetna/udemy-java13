package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
	//criando inst�ncia
	AreaCirc a1 = new AreaCirc(10);
	a1.raio=10;
	System.out.println(a1.area());
	
	
	//sem criar inst�ncia
	System.out.println(AreaCirc.area(100));
	
	}
}
