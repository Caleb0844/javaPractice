/**
 * YOU MADE IT TO THE END OF CHAPTER 7! 🎉
 * We've learned a lot about classes and objects in Java.... but we're not done yet! 😅
 * Inspired by the mobile game "Good Coffee, Great Coffee" ☕️☕️☕️☕️☕️
 */



// Create a new class named Order here! 💖
class Order{
  String orderName;
  String drinkName;
  double price;
  boolean isIced;
  char size;
  boolean toGo;

   Order(String orderName, String drinkName, double price, boolean isIced, char size, boolean toGo)
   {
          this.orderName = orderName;
          this.drinkName = drinkName;
          this.price = price;
          this.size = size;
          this.isIced = isIced;
          this.toGo = toGo;

        }

}

public class Main {
    public static void main(String[] args) {
        // Create a new Order object here! 💖
       

        Order jack = new Order("Jack", "mocha latte", 6.99, true,'L', true );
        Order ryan = new Order ("Kate", "Espresso", 4.99, true, 'M', true);
        Order julien = new Order("Allison", "mocha latte", 7.99, true, 'M', false );

        


        // Add print statements here! 💖
        System.out.println("Order for " + jack.orderName +" "+ jack.drinkName+ "size " + jack.size+" " + "iced " + jack.isIced);
        System.out.println("Order for " + ryan.orderName +" "+ ryan.drinkName+ "size " + ryan.size +" "+ "iced " + ryan.isIced);
        System.out.println("Order for " + julien.orderName +" "+ julien.drinkName+ "size " + julien.size +" "+ "iced " + julien.isIced);

        
    }


}
