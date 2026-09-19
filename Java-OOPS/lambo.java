public class lambo {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.name);
        System.out.println(car.model);
        System.out.println(car.price);
        System.out.println(car.condition);

        car.start();
        car.drive();
        car.stop();


    }
}
