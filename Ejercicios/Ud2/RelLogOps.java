//Ilustra los operadores relacionales y lógicos.
class RelLogOps {
    public static void main(String[] args) {
        //VARIABLES
        int i, j;
        boolean b1,b2;

        //Operadores relaccionales
        i=10;
        j=11;

        if( i<j ) System.out.println("i<j");
        if(i<=j ) System.out.println("i<=j");
        if(i!=j ) System.out.println("i!=j");
        if(i==j ) System.out.println("this won´t execute");
        if(i>=j ) System.out.println("this won´t execute");
        if( i>j ) System.out.println("this won´t execute");

        
        //Operadores lógicos
        b1= true;
        b2= false;
        if(b1&b2)System.out.println("This won´t execute");
        if(!(b1&b2))System.out.println("!b1 & b2 is true");
        if(b1|b2)System.out.println("b1|b2 is true");
        if(b1^b2)System.out.println("b1^b2 is true");
    }
}