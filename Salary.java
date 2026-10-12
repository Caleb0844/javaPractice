import java.util.*;
public class Salary {
    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        System.out.println("Enter name, age and salary");

        String name = salary.nextLine();
        int age = salary.nextInt();
        double payment = salary.nextDouble();

        System.out.println("Name: "+name);
        System.out.println("Age "+age);
        System.out.println("Salary: "+payment);
  

        
    }
}
