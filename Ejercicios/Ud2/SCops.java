//Ilustra los operadores de cortocircuito.
public class SCops {
    public static void main(String[] args) {
        int n, d; //q;

        n=10;
        d=2;

        if(d != 0 && (n%d) ==0) 
            System.out.println(d+" is a factor of " +n);

        //establecemos d en cero
        d=0;
        //Como d es cero, el segundo operando no se valida
        if(d != 0 && (n%d) ==0) 
            System.out.println(d+" is a factor of " +n);


            
        /*
        Si se intenta lo mismo sin el operador de cortocircuito se produce un error de división por cero.

        if(d != 0 & (n%d) ==0) 
            System.out.println(d+" is a factor of " +n);

        */
    }
}
