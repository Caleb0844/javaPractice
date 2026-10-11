public class Pit{
    final int x;
    final double z;

    public Pit(int x, double z){
        this.x =x;
        this.z = z;
    }

    public static void main(String[] args) {
        Pit tst = new Pit(4, 3.13);
       //tst.x = 12; // wont work since the declred variables are final
       //  tst.z = 3.44; //same with this one

    }
}