public class ConversionTipos {
    public static void main() {
        // String a entero
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        byte numeroByte = Byte.parseByte(numeroStr);
        short numeroShort = Short.parseShort(numeroStr);
        long numeroLong = Long.parseLong(numeroStr);

        // String a decimal
        String realStr = "98765.43";
        String realNotCientifica = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        double realNotCientDouble = Double.parseDouble(realNotCientifica);
        float realFloat = Float.parseFloat(realStr);
        float realNotCientFloat = Float.parseFloat(realNotCientifica);

        // String a boolean
        String logicoStr = "true";
        // Este método solo parsea correctamete true y false (y otras varientes de escritura).
        // Valores como 0 y 1 o yes y no, no se parsearán y darán false como resultado.
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);

        // Entero a String
        int otroNumInt = 100;
        String otroNumStr = Integer.toString(otroNumInt);
        otroNumStr = String.valueOf(otroNumInt);

        // Decimal a String
        double otroRealDouble = 1.23456;
        double otroRealNotCient = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        String otroRealNotCientStr = Double.toString(otroRealNotCient);
        otroRealStr = String.valueOf(1.23456f);

        // Int a Short (Aquí puede haber pérdida de información, pues int es más grande que short)
        int i = 10000;
        short s = (short)i;

        // Int a Long (Aquí no hay pérdida de información porque long es más grande que int)
        long l = i;

        // Int a Char
        char ch = (char)i;

        // Int a Float
        float f = (float)i;

    }
}
