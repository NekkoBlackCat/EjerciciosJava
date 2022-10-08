//ILUSTRA EL ÁMBITO DE BLOQUES.
class ScopeDemo {
    public static void main(String[] args) {
        int x; //conocido para todo el código de main
        x=10;
        
        if(x==10) { //Iniciamos un nuevo ámbito aqui
            int y=20; //Solo es conocido para este bloque.

            //x e y se conocen aqui.

            System.out.println("x and y: " +x+" "+y);
            x=y*2;
        }
        //y=100; // ERROR! y es desconocido aquí.
        //x sigue siendo conocido
        System.out.println("x es "+x);
    }
}