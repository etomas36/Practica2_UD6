package ed.etomas;
import ed.etomas.Calculadora;

public class test {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		int oper1 = calculadora.elevar(5, 0);
		System.out.println(oper1);
		
		String op3 = calculadora.obtenerTodosLosMultiplosDeDos(10);
		System.out.println(op3);

	}

}
