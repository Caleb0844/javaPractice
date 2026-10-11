

public class methodOverloading {
    public static int publicMethodAdd(int x, int y){
        return x + y;
    }
    public static double publicMethodDOuble(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        
    double dbl = publicMethodDOuble(5.6, 33.55);
    int itn = publicMethodAdd(5, 56);
    System.out.println(dbl);
    System.out.println(itn);

}
}

