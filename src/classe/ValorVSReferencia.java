package classe;

public class ValorVSReferencia {
public static void main(String[] args) {
	double a=2;
	double b=a; //atribuição por valor, ou seja, uma cópia (Tipo primitivo)
	a++;
	b--;
	System.out.println(a+" -- "+b);

 //--------------------
	Data d1=new Data(1,6,2022);
	Data d2 = d1; //atribuição por referência, por estar trabalhando com objeto
	d1.dia=31;
	System.out.println(" "+d1.dia+"/"+d1.mes+"/"+d1.ano);
	System.out.println(" "+d2.dia+"/"+d2.mes+"/"+d2.ano);
	System.out.println(d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada());
	d1.dia=04;
	System.out.println(d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada()+" | As duas variáveis apontam para o mesmo objeto em memória, por isso \n dia foi alterado"); 
	
	voltarDataParaValorPadrao(d2);
	System.out.println(d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada()+" | O objeto data foi passado como parâmetro do método voltarDataParaPadrao, por isso o valor do objeto foi alterado"); 
	
}
static void voltarDataParaValorPadrao(Data d){
	d.dia=1;
	d.mes=1;
	d.ano=1970;
		}

}
