package entradateclado;

import java.util.Scanner;

/**
 *
 * @author Alberto Hernández
 */
public class EntradaTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Comienzo del programa... ");
        System.out.println("Escribe tu nombre: ");
        
        String nombre = "";
        Scanner entradaTeclado = new Scanner(System.in);
        
        nombre = entradaTeclado.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
