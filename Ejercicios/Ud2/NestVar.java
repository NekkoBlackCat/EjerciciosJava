/*
    Este programa intenta declarar una variable en un ámbito interno con
    el mismo nombre que otra definida en el ámbito externo.
*/




/*

    *** Este programa no se compila ***
class NestVar {
    public static void main(String[] args) {
        int count;

        for ( count=0; count<10; count=count+1 ) {
            System.out.println("esta es cuenta: " +count);

            int count; //INCORRECTO! count ya se ha declarado como variable antes (en el ámbito externo)
            for(count=0; count<2; count++)
            System.out.println("this program is in error!");
        }
    }
}


*/