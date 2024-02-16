public class DatatypesInJava {
    // primitive  datatypes types:- byte short int long float double boolean.
    public static void main(String[] args) {
        byte byteValue1 = 2;
        byte byteValue2 = 4;
        byte byteResult = (byte)(byteValue1 + byteValue2);
        System.out.println("Sum of two bytes: " + byteResult);
        
        short shortValue1 = 300;
        short shortValue2 = 500;
        short shortResult = (short)(shortValue1 + shortValue2);
        System.out.println("Sum of two shorts: " + shortResult);

        int intValue1 = 2;
        int intValue2 = 4;
        int intResult = intValue1 + intValue2;

        System.out.println("Int: " + intResult);

        long longValue1 = 2L;
        long longValue2 = 4L;
        long longResult = longValue1 + longValue2;

        System.out.println("Long: " + longResult);

        float floatValue1 = 2.0f;
        float floatValue2 = 4.0f;
        float floatResult = floatValue1 + floatValue2;

        System.out.println("Float: " + floatResult);

        double doubleValue1 = 2.0;
        double doubleValue2 = 4.0;
        double doubleResult = doubleValue1 + doubleValue2;

        System.out.println("Double: " + doubleResult);

        boolean booleanValue = true;

        System.out.println("Boolean: " + booleanValue);

        char charValue = 'A';

        System.out.println("Char: " + charValue);


        // Java Reference/Object Data Type
        // Creating an object of 'Animal' class
        // Animal animal = new Animal("giraffe");

        // Creating an object of 'String' class
        // String myString = new String("Hello, World!");


    }
}
