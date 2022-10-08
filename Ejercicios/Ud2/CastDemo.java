//Ejemplo de conversión
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // Convertir double a int. Se produce recorte.
        System.out.println("Resultado entero de x / y: " + i);

        i = 100;
        b = (byte) i; // No se pierde información, byte puede almacenar el valor 100.
        System.out.println("Valor de b: " + b);

        i = 257;
        b = (byte) i; // Se pierde información.
        System.out.println("valor de b: " + b);

        b = 88; // Código ASCII para X
        ch = (char) b; // Conversión entre tipos incompatibles.
        System.out.println("ch: " + ch);
    }
}
