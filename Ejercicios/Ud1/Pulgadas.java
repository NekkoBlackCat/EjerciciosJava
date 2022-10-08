/*
    Ejercicio Pulgadas
    Adapte el ejercicio 1.2 para que imprima una tabla de conversión de pulgadas a metros.
    Muestre 12 pies de conversiones, pulgada a pulgada.
    Muestre una línea en blanco cada 12 pulgadas (un metro equivale aproximadamente a 39.37 pulgadas)
*/
class Pulgadas {
    public static void main(String[] args) {

        //establecemos las variables.
        int pulgadas, count;
        double metros; 
        count = 0;
        

        //creamos el bucle for
        for (pulgadas=1; pulgadas<144; pulgadas++ ) {
            metros= pulgadas/39.37;
        
            //mensaje reiterativo en pantalla con bucle for
            System.out.println
            (pulgadas + " pulgadas son " + metros + " metros");

            //Creamos el reloj. Cada vuelta suma uno, si es igual a doce, muestra una linea en blanco y vuelve a 0.
            count ++;
            if (count == 12) {
                System.out.println();
                count = 0; 
            }
        }
    }
}