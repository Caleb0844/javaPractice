class Animal{
    public void animalSound(){
        System.out.println("These animals make sounds");
    }
    public static void main(String[] args) {
        System.out.println("These are my animals");

        Animal myAnimal = new Animal();
        myAnimal.animalSound();
    }
}