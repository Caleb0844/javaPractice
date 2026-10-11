class MainAnimal {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Pig myPig = new Pig();
    Dog myDog = new Dog();
    myAnimal.animalSound();
    myDog.animalSound();
    myPig.animalSound();
  }
}