import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String restart;

        do {
            System.out.println("You have been transported to the year 3433. You wake up and notice that you're no longer on Earth. Gravity feels different. It's dark outside and as you stand up, you realize you're outside... a house?\nSelect one: [a] Walk towards the house or [b] call out to the house");
            String select = scanner.nextLine();

            if (select.equals("a")) {
                System.out.println("..walking towards the house, what do you want to do? k] knock, r] run");
                String option = scanner.nextLine();
                if (option.equals("k")) {
                    System.out.println("Welcome to the future, strange man.");
                } else if (option.equals("r")) {
                    System.out.println("You decided to run and fell off a cliff.");
                } else {
                    System.out.println("Enter either r or k");
                }
            } else if (select.equals("b")) {
                System.out.println("Calling out to the house!! You ran and found some wild berries! t] take them n] not take them");
                String berries = scanner.nextLine();
                if (berries.equals("t")) {
                    System.out.println("You took the wrong berries and died.");
                } else if (berries.equals("n")) {
                    System.out.println("You live to see another day!!!");
                } else {
                    System.out.println("Enter either t or n");
                }
            } else {
                System.out.println("Enter either a or B");
            }

            System.out.println("Press [y] to restart, anything else to quit.");
            restart = scanner.nextLine();

        } while (restart.equals("y"));
    }
}