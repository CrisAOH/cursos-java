import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog("Ingrese un número entero: ");
        int numeroDecimal = 0;

        try {
             numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero.");
            main(args);
            System.exit(0);
        }

        System.out.println("Número decimal: " + numeroDecimal);

        String resultadoBinario = "Número binario de " + numeroDecimal + ": " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        
        int numeroBinario = 0b111110100;
        System.out.println("Número binario: " + numeroBinario);

        String resultadoOctal = "Número octal de " + numeroBinario + ": " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0764; //Con anteponer un 0 a un numero decimal, Java sabrá que se trata de un número octal.
        System.out.println("Número octal: " + numeroOctal);

        String resultadoHex = "Número hexadecimal de " + numeroDecimal + ": " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numerohex = 0x1f4;
        System.out.println("numerohex = " + numerohex);

        String mensaje = resultadoBinario;
        mensaje = mensaje + "\n" + resultadoOctal;
        mensaje = mensaje + "\n" + resultadoHex;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
