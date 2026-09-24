public class toyota {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Red", 2017, "superb");

        System.out.println(car1);

    }
    public static class Car {
        String brand;
        String colour;
        int year;
        String condition;

        Car(String brand, String colour, int year, String condition) {
            this.brand = brand;
            this.colour = colour;
            this.year = year;
            this.condition = condition;
        }
        @Override 
        public String toString() {
            return this.colour + " " + this.brand + " " + "of" + " " + this.year + " " + "under" + " " + this.condition + " " + "condition";
        }


    }
    
    
}
