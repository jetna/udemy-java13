package oo.polimorfismo;

public class Sorvete {
	private double peso;

 public Sorvete(double novoPeso) {
	// TODO Auto-generated constructor stub
setPeso(novoPeso);
 }

public double getPeso() {
	return peso;
}

public void setPeso(double novoPeso) {
	if(novoPeso >0) {
		this.peso = novoPeso;
	}
	
}


}
