class Carto extends Vehicle{
    private String modelName=("Ranger raptor");
    public static void main(String[] args) {
        Carto myTruck = new Carto();

        myTruck.honk();

        System.out.println(myTruck.brand +" "+myTruck.modelName);


    }
}