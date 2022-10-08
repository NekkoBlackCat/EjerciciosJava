// ¡Promoción sorpresa!
public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // No necesita conversión, el resultado ya es int.

        b = 10;
        b = (byte) (b * b); // Necesita conversión, para asignar un int a un byte.

        System.out.println("i y b: " + i + " " + b);
    }
}