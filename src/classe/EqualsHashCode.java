package classe;

public class EqualsHashCode {
	public static void main(String[] args) {
		Usuario u1= new Usuario();
		u1.nome="PEdro silva";
		u1.email="pedro@silva";
		
		Usuario u2= new Usuario();
		u2.nome="PEdro silva";
		u2.email="pedro@silva";
		
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
	}
}
