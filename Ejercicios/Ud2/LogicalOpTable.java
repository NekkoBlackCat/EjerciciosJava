// Ejercicio 2.2: Tabla de verdad de los operadores lógicos.
public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;
        System.out.println("P\t Q\t AND\t OR\t XOR\t NOT");

        p = true; q = false;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + 
        (p|q) + "\t" + (p^q) + "\t" + (!p));
        
        p = true; q = false;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + 
        (p|q) + "\t" + (p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + 
        (p|q) + "\t" + (p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + 
        (p|q) + "\t" + (p^q) + "\t" + (!p));
    }
}