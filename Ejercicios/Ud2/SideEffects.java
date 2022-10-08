/*public class SideEffects {
    public static void main(String[] args) {
        int i;

        i=0;

        //se incrementa i aunque la instrucción if falle
        if(false&(++i <100))  System.out.println("This won´t be displayed");
       
    System.out.println("If statements executed: " +i); //muestra 1

    
    //En este caso, no se incrementa i ya que el operador de cortocircuito ignora el incremento
    if(false && (++i <100)) System.out.println("This won´t be displayed");
    System.out.println("if statements executed: " +i ");
    
    }
}
*/