/*
	Ejercicio 1.1
	Este programa convierte galones a litros. Asigne el nombre GalToLit.java a este programa.	
*/
class GalToLit {
	public static void main (String args[]) {

	double gallons; //Contiene el número de galones
	double liters; //Contiene el número de litros

	gallons=10; //Empezar con 10 galones
	liters = gallons *3.7854; //convertir a litros
	System.out.println(gallons + " gallons is " + liters + " liters.");
	}
}