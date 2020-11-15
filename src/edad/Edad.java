package edad;
import java.util.Scanner;
/**
 *
 * @author D E L L
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nice = new Scanner (System.in);
        // Variables
        int edad1 = 0, edad2 = 0, edad3 = 0;
        int meses;
        int dias;
        int año;
        int actual = 2020;
        int actual2 = 11;
        int actual3 = 15;
        System.out.println("*** CALENDAR ***");
        
        //Entrada de variables
        System.out.println("Ingrese el año de nacimiento");
        año = nice.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento");
        meses = nice.nextInt();
        
        System.out.println("Ingrese su dia de nacimiento");
        dias = nice.nextInt();
        
         //Proceso
         if (año < actual){
            edad1 = (actual - año);
         }
            else {
                System.err.println(" el año que puso supera al año actual ");
            }
         if (meses <= 12){
            edad2 = (actual2 - meses);
            }
             else {
                 System.err.println("el mes que coloco supera al limite de 12 meses ");
         }
         if (dias <= 31){
            edad3 = (actual3 - dias);
         }
            else { 
                 System.err.println("Los dias que coloque supera al limitede 31 dias");
                }
        //Salida de datos
                System.out.println("Usted tiene " +edad1 +" años, " +edad2+" meses y " +edad3 +" días");
    }  
}
  
    
    

