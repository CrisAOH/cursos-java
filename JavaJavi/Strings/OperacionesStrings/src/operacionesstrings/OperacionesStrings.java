package operacionesstrings;

/**
 *
 * @author Alberto Hernández
 */
public class OperacionesStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        int enteroAUnir = 20;
        
        // Concatenación
        String mensaje = cadena1 + " " + cadena2;
        System.out.println("mensaje = " + mensaje);
        
        String textoConNumero = cadena1 + (enteroAUnir + 40);
        System.out.println("textoConNumero = " + textoConNumero);
        
        String pruebaConcat = "to".concat("get").concat("her");
        
        // Contar caracteres
        // El método length() cuenta también los espacios
        int cantidadCaracteres = "Cristhian Alberto Ortega Hernández".length();
        System.out.println("cantidadCaracteres = " + cantidadCaracteres);
        
        // Extraer una porción de una cadena
        // Los indices para substring se cuentan de 1 en adelante.
        // Para la extracción de la cadena, no se considera el caracter ubicado en el indice inicial.
        String lenguajeFavorito = "Mi lenguaje favorito es Java";
        String extraccion = lenguajeFavorito.substring(24, 28);
        System.out.println("extraccion = " + extraccion);
        
        // Igualdad de cadenas
        // El metodo equals() es case sensitive
        String saludo1 = "Hola Mundo!";
        String saludo2 = "Hola Cristhian!";
        String saludo3 = "HOLA MUNDO!";
        
        boolean esIgual = saludo1.equals(saludo2);
        System.out.println("esIgual = " + esIgual);
        
        boolean esIgualIgnoreCase = saludo1.equalsIgnoreCase(saludo3);
        System.out.println("esIgualIgnoreCase = " + esIgualIgnoreCase);
        
        // Devolver indice de algun caracter dentro de String
        // indexOf() sólo devuelve el índice de la primera ocurrencia
        int indice = "Argentina".indexOf("e");
        System.out.println("indice = " + indice);
        
        String opinion = "Uno de los países más bonitos es Japón. Japón tiene muchas cosas para ver.";
        int indiceJapon = opinion.indexOf("Japón");
        System.out.println("indiceJapon = " + indiceJapon);
        
        // Extraer un caracter a partir de un índice
        // Los índices para charAt sí se cuentan desde 0
        char letraExtraida = "Argentina".charAt(3);
        
        // Determinar si una cadena se encuentra dentro de otra
        String holaMundo = "Hola Mundo";
        boolean contiene = holaMundo.contains("Mundo");
        System.out.println("contiene = " + contiene);
        
        // Determinar si una cadena empieza con un valor
        String favorito = "Java es mi lenguaje favorito";
        boolean esFavorito = favorito.startsWith("Java");
        System.out.println("esFavorito = " + esFavorito);
        
        // Determinar si una cadena termina con un valor
        String optimo = "Uno de los lenguajes más óptimos es C++";
        boolean esOptimo = optimo.endsWith("C++");
        System.out.println("esOptimo = " + esOptimo);
        
        // Determinar si una cadena está vacía
        // Los espacios son considerados como un caracter
        System.out.println("La cadena está vacía?" + ("".isEmpty()));
        
        // Reemplazar cadenas
        String cadenaAReemplazar = "La ley de la relatividad fue publicada por Pascal";
        String cadenaReemplazada = cadenaAReemplazar.replace("Pascal", "Einstein");
        
        // Eliminar espacios en blanco al inicio y final
        String cadenaConEspacios = "   Mi nombre es Cristhian   ";
        System.out.println("cadenaConEspacios = " + cadenaConEspacios);
        String cadenaSinEspacios = cadenaConEspacios.strip();
        System.out.println("cadenaSinEspacios = " + cadenaSinEspacios);
        
        // Convertir caracteres a minúsculas
        System.out.println("HOLA MUNDO".toLowerCase());
        
        // Convertir caracteres a mayúsculas
        System.out.println("hola mundo".toUpperCase());
        
        // Convertir valores numéricos a String
        int numero = 103;
        String numeroString = String.valueOf(numero);
        System.out.println("numeroString = " + numeroString);
    }
    
}
