import java.util.Scanner;

public class Olive_Morla_Marc_EjercicioPRO3_7 {

	public static void main(String[] args) {
		

	//Iniciamos Scanner
	Scanner sc = new Scanner(System.in);

	//Declaramos variables
	boolean Enchufada=false;
	boolean Funciona=false; 
	String resultado;
	boolean BombillaFundida=false;
	boolean InterruptorEstropeado;
		
	//Mostramos en pantalla una pregunta y la respuesta se guardara en la variable "Enchufada"
	System.out.println("Esta enchufada la lampara? contesta con true o false");
	Enchufada= sc.nextBoolean();
	
	//Aqui si la lampara esta enchufada y funciona el string no mostrara nada y saltara a la siguiente linea,
	//si no esta enchufada mostrara la pregunta
	resultado= Enchufada==true?"":"Enchufar lampara, Funciona? contesta con true o false ";
	System.out.println(resultado);
	Funciona= Enchufada==true? false:sc.nextBoolean();

	// contestamos a la pregunta anterior
	resultado= Funciona==false?"Bombilla Fundida?":"";//El problema no se soluciona, preguntamos si sigue sin funcionar, y devolvemos un resultado u otro.
	System.out.println(resultado);
	BombillaFundida= Funciona==false?sc.nextBoolean():false;//Le damos valor a la variable BombillaFundida preguntando si no funciona,
	//si no funciona, introduciremos la respuesta a Bombilla Fundida? si en cambio funciona es true, BombillaFundida sera false, porque no está fundida.

	
	resultado= Funciona==false?(BombillaFundida==true?"Cambiar Bombilla, Funciona?":""):"";//Volvemos a imprimir en pantalla un string, preguntamos si Funciona es false,

	System.out.println(resultado);
	Funciona= Funciona==false?(BombillaFundida==true?sc.nextBoolean():false):true;//Comprobamos si funciona, si funciona es falso, preguntaremos si Bombilla Fundida es true, 
	//de ser asi, introduciremos la respuesta a Cambiar Bombilla, Funciona?, si no ser asi, seguira sin funcionar la lampara.
	//Si es false que funciona==false, la respuesta será true.
	
	resultado= Funciona==false?"Esta Estropeado el Interruptor?":"";//Vamos haciendo lo mismo que más arriba con las otras variables
	System.out.println(resultado);
	InterruptorEstropeado= Funciona==false? sc.nextBoolean():false;
	
	resultado= Funciona==false?(InterruptorEstropeado==true?"Cambiar Interruptor,Funciona?":""):"";
	System.out.println(resultado);
	Funciona= Funciona==false?(InterruptorEstropeado==true?sc.nextBoolean():false):true;
	
	resultado=Funciona==false?"Comprar otra lampara":"Problema Resuelto";//Por ultimo preguntamos si funciona es false, si es true que funciona es false,
	// habra que comprar otra lampara y si es false que funciona es false, es decir, funciona es true, problema resuelto.
	
	// imprimimos resultado.
	System.out.println(resultado);
	
	sc.close();
	}
}
		
				
