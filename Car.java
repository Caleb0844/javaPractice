/*public class Car {
    public void fullThrottle(){
        System.out.println("Car going crazy");
    }
    public void speed(int maxSpeed){
        System.out.println("Cars speed is "+ maxSpeed);
    }


    public static void main(String[] args) {
        Car spes = new Car();
        spes.fullThrottle();
        spes.speed(339);

    }
    }*/
class Car extends Vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args){
    Car myCar = new Car();

    myCar.honk();

    System.out.println(myCar.brand +" "+myCar.modelName);

    }
}
