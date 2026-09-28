public class anothermain {
    public static void main(String[] args) {

        Car car = new Car("G-Wagon", 2025, "V12");

        System.out.println(car.carname);
        System.out.println(car.year);
        System.out.println(car.engine.type); //printing the compostion of objects 


    }
    public static class Engine {

        String type;

        Engine(String type) {
            this.type = type;
        }

    }
    public static class Car {

        String carname;
        int year;
        Engine engine;

        Car(String carname, int year, String engineType) {
            
            this.carname = carname;
            this.year = year;
            this.engine = new Engine(engineType);



        }
    }
}