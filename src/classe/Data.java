package classe;
public class Data {
	int dia=01;
	int mes=01;
	int ano=1970;
	
	String obterDataFormatada(){
		return String.format("%d/%d/%d",dia,mes,ano);
	}
	
	Data(){
		this(1,1,1980);
	}

	Data(int dia, int mes, int ano){
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}

}
