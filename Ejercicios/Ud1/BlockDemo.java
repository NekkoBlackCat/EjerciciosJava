/*
    Uso de un bloque de código.
    Asigne el nombre BlockDemo.java a este archivo.
*/
class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;

        i = 2;
        j = 10;

        // el destino de esta instrucción if es un bloque
        if (i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j/i is " + d);
        }
    }
}