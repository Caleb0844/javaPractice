public class Delta{
    String modelName;
    int modelYear;

    public Delta(String name, int year){
        modelName = name;
        modelYear = year;
    }

    public static void main(String[] args) {
        Delta myCar = new Delta("Mustang", 1969);
        System.out.println("Name: " + myCar.modelName);
        System.out.println("Year: " + myCar.modelYear);

    }

} 