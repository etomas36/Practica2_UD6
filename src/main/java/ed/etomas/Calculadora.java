package ed.etomas;

/**
 * Realiza operaciones simples matematicas
 * Realiza sumas, restas, divisiones y multiplicaciones.
 * @author etomas
 * @version 3.7
 * @since 2.1, jun 2022
 */


public class Calculadora {
	
	
	/**
	 * Suma de @param a y @param b
	 * Realiza la suma de 2 numeros
	 * @param a numero entero que actua como sumando
	 * @param b numero entero que actua como sumando
	 * @return valor int resultado de sumar a y b
	 */
	
	
	public int suma(int a, int b) {
		return a + b;
	}
	
	/**
	 * Resta de @param a y @param b
	 * Realiza la resta de 2 numeros
	 * @param a numero entero que actua como minuendo
	 * @param b numero entero que actua como sustraendo
	 * @return diferencia valor int resultado de restar a y b
	 */
	public int resta(int a, int b) {
		return a - b;
	}
	
	/**
	 * Multiplicacion de @param a y @param b
	 * Realiza la Multiplicacion de 2 numeros
	 * @param a numero entero que actua como multiplicando
	 * @param b numero entero que actua como multiplicador
	 * @return valor int resultado de multiplicar a y b
	 */
	public int multiplica(int a, int b){
		return a*b;
	}
	
	/**
	 * Division de @param a y @param b
	 * Realiza la division de 2 numeros
	 * @param a numero entero que actua como dividendo
	 * @param b numero entero que actua como divisor
	 * @return valor int resultado de dividir a y b
	 * @exception ArithmeticException division por 0
	 */
	public int diveix(int a, int b) {
		return a/b;
	}
	
	
	/**
	 * Eleva @param a multiplicado tantas veces como indique @param b
	 * Se realiza la elevacion de un numero tantas veces como sea indicado
	 * @param a numero entero que actua como numero a elevar
	 * @param b numero entero que actua como el numero elevador
	 * @return valor int resultado de elevar a tantas veces como b indique
	 */
	public int elevar ( int a , int n ){

	    int t = 1;

	    for ( int i = 0; i < n ; i++ ){
	        t = t * a;
	    }

	    return t; 
	}
	
	
	/**
	 * Indica si @param a es par
	 * Se comprueba si un numero es par o impar sacando su resto, comprobando que sea igual que 0
	 * @param a numero entero a comprobar
	 * @return boolean devuelve un valor booleano
	 */
	public boolean esPar ( int a ){

	    boolean r;

	    if ( a % 2 == 0) {
	        r = true;
	    } else {
	        r = false;
	    }

	    return r;
	}


	/**
	 * Comprobar si es un numero es multiplo de 2
	 * Se comprueba si un numero es multiplo de 2 y posteriormente se divide entre 2 para volver a comprobarse
	 * @param a numero entero a comprobar
	 * @return String devuelve una cadena con un 1 o un 0 segun e numero si es multiplo de 2 o no.
	 */
	public String obtenerTodosLosMultiplosDeDos(int a){

	    String r = "";
	    int v = a;
	    int v1;

	    while ( v > 0) {
	        v1 = v % 2;
	        r = v1 + r;
	        v = v / 2;
	    }
		return r;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}

