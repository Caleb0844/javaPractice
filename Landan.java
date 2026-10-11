/*public class Landan {
    String city = "London";
    int population = 900000;

    public static void main(String[] args) {
        Landan myCity = new Landan();
        System.out.println("Name: " +myCity.city);
        System.out.println("Population: "+myCity.population);
    }
}
*/
public class Landan{
    public void myCity(String name, int population){
                System.out.println("Name: "+ name);
                System.out.println("Population: "+ population);

    }
    public static void main(String[]args){
        Landan stats = new Landan();

        stats.myCity("Kenya", 50000000);
    }
}
