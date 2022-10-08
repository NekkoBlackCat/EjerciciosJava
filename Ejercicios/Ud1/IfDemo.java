//Uso de if. Asigne el nombre IfDemo.java a este archivo.
class IfDemo {
	public static void main(String args[]){
		int a, b, c;
		a=2;
		b=3;

		if (a < b) System.out.println("a is lees than b"); 
		// no muestra nada
		if (a == b) System.out.println("you won't see this");
		System.out.println();

		c= a -b; //c contiene -1
		System.out.println("c contains " + c );

		if(c >= 0) System.out.println("c  is non-negative");
		if(c < 0) System.out.println("c is negative");
		System.out.println();

		c = b - a; //c contiene ahora 1
		System.out.println("c contains " + c);
		if(c >= 0) System.out.println("c is non-negative");
		if(c < 0) System.out.println("c is negative");
	}
}