// Demostrar valores boolean
class BoolDemo {
    public static void main(String[] args) {
        boolean b;

        b=false;
        System.out.println("b is " + b);
        b=true;
        System.out.println("b is " + b);

        //un valor boolean puede controlar la instruccion if
        if(b) System.out.println("This is executed");
        b=false;
        if (b) System.out.println("This is not executed");

        //El resultado de un operador relacional es un valor boolean
        System.out.println("10 > 9 is " + (10>9));
    }
}