public class generics {
    public static void main(String[] args) {

        Box<Integer> number = new Box<>(10);
        number.showValue();

        Box<String> name = new Box<>("Adarsh");
        name.showValue();
    }
}
class Box<T> {
    T value;

    Box(T value) {
        this.value = value;
    }

    void showValue() {
        System.out.println("Value: " + value);
    }
}


