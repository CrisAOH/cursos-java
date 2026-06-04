import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        try {
             numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("Número decimal: " + numeroDecimal);

        String resultadoBinario = "Número binario de " + numeroDecimal + ": " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "Número octal de " + numeroDecimal + ": " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "Número hexadecimal de " + numeroDecimal + ": " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje = mensaje + "\n" + resultadoOctal;
        mensaje = mensaje + "\n" + resultadoHex;
        System.out.println(mensaje);
    }
}
