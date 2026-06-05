import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreFactura = "";
        double precioUno = 0.0;
        double precioDos = 0.0;
        double totalBruto = 0.0;
        double impuesto = 0.0;
        double totalFinal = 0.0;

        System.out.println("Ingrese nombre de la factura: ");
        nombreFactura = scanner.nextLine();

        try {
            System.out.println("Ingrese el precio del producto 1: ");
            precioUno = scanner.nextDouble();

            System.out.println("Ingrese el precio del producto 2: ");
            precioDos = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar número decimal.");
            main(args);
            System.exit(0);
        }

        totalBruto = precioUno + precioDos;
        impuesto = totalBruto * 0.19;
        totalFinal = totalBruto + impuesto;

        System.out.println("La factura \"" + nombreFactura + "\" tiene un total bruto de $" + totalBruto + ", con un impuesto de $" + impuesto + " y monto final de $" + totalFinal);
    }
}
