package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashSet conjunto = new HashSet();
		conjunto.add(1.2); //será convertido para uma classe do tipo Double
		conjunto.add(true); //será convertido para uma classe do tipo Boolean
		conjunto.add("teste");
		conjunto.add(1); //será convertido para uma classe do tipo Integer
		conjunto.add('x');
	
	System.out.println(conjunto.size());
	
	//remover elementos do conjunto
	System.out.println(conjunto.remove("teste"));
	
	System.out.println(conjunto.size());
	System.out.println(conjunto.contains("teste"));
	
	@SuppressWarnings("rawtypes")
	Set nums = new HashSet();
	nums.add(1);
	nums.add(4);
	nums.add(7);
	System.out.println(nums);
	System.out.println(conjunto);
	conjunto.addAll(nums); //fazendo UNIÃO dos conjuntos
	System.out.println(conjunto);
	conjunto.retainAll(nums);
	System.out.println(conjunto);
	}
}
