/*
    Las variables de caracteres se pueden procesar como enteros.
*/
class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch=  'x' ;
        System.out.println("ch contains " + ch );

        ch++; //incrementa ch
        System.out.println("ch is now " + ch);

        ch=90; //asignar el valor indicado a ch
        System.out.println("ch is now " + ch);
    }
}