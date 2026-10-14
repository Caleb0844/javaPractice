public class Expecto {
    public static void main(String[] args) {
        try{
        int[] myArray = {1,2,3,4,5};
        
        System.out.println(myArray[10]);
        int result = 10/0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array cant be reached bruv");
        }catch(ArithmeticException e){
            System.out.println("Cant do that here");
        }catch(Exception e){
            System.out.println("Something went wrong!");
        }
    }
}
