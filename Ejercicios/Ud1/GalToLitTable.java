/*
    Ejercicio 1.2
    Este programa muestra una tabla de 
    conversión de galones a litros.

    Asigne el nombre GalToLitTable.java a este programa.
*/
class GalToLitTable {
    public static void main(String[] args) {
        int gallons, counter;
        double liters;

        counter =0; //El contador de lineas se establece inicialmente en cero.
        for(gallons =1; gallons <=100; gallons++) {
            liters = gallons *3.7854; //convertir a litros.
            
            System.out.println
            ( gallons + " gallons is " + liters + " liters.");

            counter++ ; //Se incrementa el contador de lineas en cada iteracción del bucle.
            if(counter == 10) {
                System.out.println(); //Si lleva 10 lineas, imprime una linea en blanco
                counter = 0; //restablecer el contador de lineas
            }
        }
    }
}