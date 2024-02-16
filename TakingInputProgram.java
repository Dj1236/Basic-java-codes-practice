import java.util.Scanner;
public class TakingInputProgram {


    public static void main(String[] args) {
        String a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("loda a declare aaj karis value toh nakh");
        a = scanner.nextLine();
        System.out.println("haal have b ni pan nakh ");
        b = scanner.nextLine();


        System.out.println("a ni aa value che bhai " + a);
        System.out.println("b ni a value che " + b);
        scanner.close();
        
    }
    
}
