/*
    Usar el teorema de Pitágoras para calcular la longitud de la hipotenusa
    dadas las longitudes de los dos lados opuestos.
*/
class Hypot {
    public static void main(String[] args) {
        //establecemos las variables:
        double x,y,z;
        x=3; y=4;

        //Aplicamos teorema (la hipotenusa es igual a raiz cuadrada de la suma de los cuadrados de los catetos)
        //invocamos "Math" que es la clase a la que pertenece el método sqrt.
        //El método sqrt devuelve un valor double que es la raiz cuadrada de su argumento double.
        z=Math.sqrt( x*x + y*y );

        System.out.println("La hipotenusa es: " +z);
    }
}