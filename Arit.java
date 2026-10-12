public class Arit {
    public void pcheckAge (int tage){
        if(tage <= 18){
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else{
            System.out.println("Access granted clear- You are of enough age");
        }
    }
        public static void main(String[]args){
        Arit person = new Arit();
        person.pcheckAge(12);
        }
    }

