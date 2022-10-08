//El operador módulo %
class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;

        iresult=10/3;
        irem=10%3;

        dresult=10.0/3.0;
        drem=10.0%3.0;

        System.out.println("Resultado de 10 entre 3: " + iresult + "  Resto: " + irem);
        System.out.println("Resultado de 10.0 entre 3.0: " + dresult + "  Resto: "+ drem);
    }
}