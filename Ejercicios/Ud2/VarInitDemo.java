//Ilustra la duración de una variable.
class VarInitDemo {
    public static void main(String[] args) {
        int x;
        for(x=0 ; x<3 ; x++) {
            int y=-1; //y se inicializa cada vez que se entra al bloque
            System.out.println("y es: " + y); //siempre imprime -1
            y=100;
            System.out.println("y es ahora " + y );
        }
    }
}