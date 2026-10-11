/*public class Attribtes {
    int x;


public static void main(String[]args){
    Attribtes myObj = new Attribtes();
    myObj.x = 40;
    System.out.println(myObj.x);

}
}*/

//overriding

/*public class Attribtes{
    int x = 25;


    public static void main(String[] args) {
        Attribtes myObj = new Attribtes();
        myObj.x = 33;
        System.out.println(myObj.x);

    }
}*/

//if you dont want overridden, then use final

public class Attribtes{
    final int x = 5;

    public static void main(String[] args) {
         Attribtes myObj = new Attribtes();
         //myObj.x = 33;
        System.out.println(myObj.x);
    }
}