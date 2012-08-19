package tres;

public class Datos {

    public static void main(String[] args) {
        
        boolean verdadero = true;
        boolean falso = false;
        
        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        
        
        System.out.println("Boolean minimo: " + falso);
        System.out.println("Boolean maximo: " + verdadero);
        
        System.out.println("(int)Char minimo: " + (int)minChar);
        System.out.println("(int)Char maximo: " + (int)maxChar);
        
        System.out.println("Char minimo: " + minChar);
        System.out.println("Char maximo: " + maxChar);
        
        System.out.println("Byte minimo: " + minByte);
        System.out.println("Byte maximo: " + maxByte);
        
        System.out.println("Short minimo: " + minShort);
        System.out.println("Short maximo: " + maxShort);
        
        System.out.println("Int minimo: " + minInt);
        System.out.println("Int maximo: " + maxInt);
        
        System.out.println("Long minimo: " + minLong);
        System.out.println("Long maximo: " + maxLong);
        
        System.out.println("Float minimo: " + minFloat);
        System.out.println("Float maximo: " + maxFloat);
        
        System.out.println("Double minimo: " + minDouble);
        System.out.println("Double maximo: " + maxDouble);
        

    }

}
