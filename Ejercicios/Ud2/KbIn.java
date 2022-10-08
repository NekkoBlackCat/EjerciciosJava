// Leer un carácter desde el teclado.
public class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {

            char ch;
            System.out.println("Pulsa una tecla y después enter: ");

            ch = (char) System.in.read(); // obtener char. Lee un carácter desde teclado.
            System.out.println("Tu tecla es; " + ch);
        }
}