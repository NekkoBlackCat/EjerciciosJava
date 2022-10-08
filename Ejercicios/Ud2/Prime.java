//Buscar números primos entre 2 y 100.
public class Prime {
    public static void main(String[] args) {
        int i, j;
        boolean isprime;

        for (i=2; i < 100; i++) {
            isprime = true;

            //comprobar si el número se puede dividir entre dos
            for(j=2; j <= i/j; j++)
                //en caso afirmativo, NO es primo
                if((i%j) == 0) isprime = false;
            
            if(isprime)
                System.out.println(i + " es primo");
        }
    }
}