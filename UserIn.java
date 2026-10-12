import java.util.Scanner;

public class UserIn {
    public static void main(String[] args) {
        
    Scanner userIn = new Scanner(System.in);
    System.out.println("Whats Yuour name? ");

    String name = userIn.nextLine();
    System.out.println("Name is: "+name);
    
}
}
