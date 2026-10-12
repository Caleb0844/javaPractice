public class MainFour {
    public static void main(String[] args) {
        Greetings hey = new Greetings() {
            public void sayHello(){
                System.out.println("Heyyyy!!");
            }
        };
        hey.sayHello();
    }
    
}
