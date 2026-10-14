public class Citizen {
    public static void main(String[] args) {
        boolean isCitizen = false;
        int age = 15;

        if(age >18){
            System.out.println("Youre old enough to vote");
            if (isCitizen){
                System.out.println("You can vote youre a citizen");
            }else{
                System.out.println("You cant vote you are not a citizen");
            }

        }else{
            System.err.println("You arent old enough to vote");
        }
    }
    
}
