public class livingentities {
    public static void main(String[] args) {

        Plants plant = new Plants();
        Dogs dog = new Dogs();

        System.out.println(plant.isAlive);
        System.out.println(dog.isMammal);

        plant.fruits();
        dog.qualities();

    }
    
}
