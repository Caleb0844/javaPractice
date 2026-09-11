public class EarthMoonWeight {
    // Create method here 💖
    public static double earthMoonWeight(String name, int weight, String unit){
        double weightMoon = weight * (1.62 / 9.81);
        return weightMoon; // <-- return the value
    }

    public static void main(String[] args) {
        // Call the method here 💖
        String name = "Caleb";
        int weight = 63;
        String unit = "Kg";

        double moonWeight = earthMoonWeight(name, weight, unit); // <-- store result here

        System.out.println("Hi " + name + "! Your weight on Earth is " + weight + " " + unit + " and your weight on the moon would be about " + moonWeight + " " + unit + ".");
    }
}