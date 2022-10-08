/*
Este programa muestra una tabla de conversión de pulgadas a metros.

Asignar el nombre InchToMeterTable.java a este programa.
*/
public class InchToMeterTable {
    public static void main(String[] args) {
        //declaramos las variables:
        double inches, meters;
        int counter;

        //establecemos el contador a 0:
        counter=0;
        //Creamos el bucle for.
        for (inches= 1; inches <=144; inches++) {
            meters = inches / 39.37; //Convertir las pulgadas actuales a metros.
            System.out.println(inches + " pulgadas son " + meters + " metros.");

            counter++;
            //cada 12 líneas, imprimir una linea en blanco
            if (counter == 12) {
                System.out.println();
                counter = 0; //restablece el contador de líneas a 0.
            }
        }
    }
}
