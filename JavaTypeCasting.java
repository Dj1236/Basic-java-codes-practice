public class JavaTypeCasting {
    //Type casting is a technique that is used either by the compiler 
    //or a programmer to convert one data type to another. For example, 
    //converting int to double, double to int, short to int, etc. 
    /* There are two types of cast typing allowed in Java programming:
        Widening type casting :-Widening Type Casting is also known as implicit type casting
        in which a smaller type is converted into a larger type, it is done by the compiler automatically
       Narrowing type casting :- */
    public static void main(String[] args) {
        // int num1 = 5004;
        // double num2 = 2.5;
        // int sum = num1 + num2; error:-type mismatch: cannot convert from double to int.
        int num1 = 5004; // this is widening type casting.
        double num2 = 2.5;
        double sum = num1 + num2; // this will not give error
        System.out.println("Sum : " + sum);
            
        // now lets see narrow casting 
        int num = 5004;
      // Type casting int to double
        double doubleNum = (double) num;
      // show output
        System.out.println("The value of " + num + " after converting to the double is " + doubleNum);
      // Type casting double to int
        int convertedInt = (int) doubleNum;
      // show output
        System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);
}
}


