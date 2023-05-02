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

}

