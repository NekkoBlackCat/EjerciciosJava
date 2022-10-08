/*
   Esteprograma ilustra las diferencias entre int y double.
   Asigne el nombre Example3.java a este archivo.
*/

class Example3 {
	public static void main (String args []) {
	int var; //declara una variable integer (enteros)
	double x; //declara una variable de coma flotante

	var = 10; //asigna el valor 10 a var
	x = 10.0; //asogma eñ valor 10.0 a x

	System.out.println("Original value of var: " +var);
	System.out.println("Original value of x: " + x);
	System.out.println (); //imprimir una linea en blanco

	// dividir ambas por 4
	var = var/4;
	x = x/4;
	System.out.println("var after division: " +var);
	System.out.println("x after division: " +x);
	}
}