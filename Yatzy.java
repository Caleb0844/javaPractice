public class Yatzy {
    public static void main(String[] args) {
        
        int dice = 1;
        while(dice <= 6){
            if (dice < 6){
                System.out.println("No yatzy");
            }else{
                System.out.println("Yatzy");
            }
            dice ++;
        }
    }
}
