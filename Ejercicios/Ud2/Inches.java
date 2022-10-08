/*
    Calcular el número de pulgadas cúbicas en una milla cúbica.
*/
class Inches {
    public static void main(String[] args) {
        //establecemos las variables (cubic inches, )
        long ci, im;

        im=5280*12;
        ci=im*im*im;

        System.out.println("there are " + ci + " cubic inches in cubic mile");
    }
}