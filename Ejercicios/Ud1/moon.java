/*
    Calcular su peso en la luna. 
    Asignar el nombre Moon.java a este programa.
*/
class Moon {
    public static void main(String[] args) {
        double earthweight;
        double moonweight;
        earthweight = 80;

        moonweight = earthweight*0.17;
        System.out.println(earthweight + " Kilos en la tierra equivalen a " + moonweight + " Kilos en la luna");
    }
}