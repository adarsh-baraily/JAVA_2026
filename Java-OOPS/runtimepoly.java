import java.util.Scanner;

public class runtimepoly {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Animal animal;
        
        System.out.print("Enter the choice of animal, 1 for cat and 2 for dog : ");
        int choice = sc.nextInt();

        if (choice == 1) {
            animal = new Cat();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Dog();
            animal.speak();
        }
        else {
            System.out.println("Invalid choice");
        }

    }
    
public static abstract class Animal {
    abstract void speak();
}
public static class Cat extends Animal {
    @Override 
    void speak() {
        System.out.println("This animal says meow");
    }
}
public static class Dog extends Animal {
    @Override 
    void speak() {
        System.out.println("This animal barks !");
    }
}
}