public class game {
    public static int myMethod(int x){
        return x * 2;
    }

    public static void main(String[] args){
    
    for(int i = 1; i<5; i++){
        System.out.println("The double for number " + i + "is "+ myMethod(i));
    }
    
}
}