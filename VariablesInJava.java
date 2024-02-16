public class VariablesInJava {
    public String name; // instance variable
    public double salary; // instance variable
    


    public void MyAge (){
        int age = 0;
        age = age + 20;
        System.out.println("my age is "+ age );
        // int age;        Test.java:4:variable number might not have been initialized
        // age = age + 7;
        //  ^
        //  1 error // age = age + 7

        
    }
    public static void main(String[] args) {
        
        // int a, b, c;         // Declares three ints, a, b, and c.
        // int a1 = 10, b1 = 10;  // Example of initialization
        // byte B = 22;         // initializes a byte type variable B.
        // double pi = 3.14159; // declares and assigns a value of PI.
        // char a2 = 'a';        // the char variable a iis initialized with value 'a'

        // local scope of variable with intialization.
        VariablesInJava test = new VariablesInJava();
        test.MyAge();


    }
}
