//Ilustra la inicialización dinámica.
class DynInit{
    public static void main(String[] args) {
        double radius = 4, height = 5;

        //inicializar volumen de forma dinámica en tiempo de ejecucion
        double volume =3.1416*radius*radius*height;

        System.out.println("El volumen es " + volume);
    }
}