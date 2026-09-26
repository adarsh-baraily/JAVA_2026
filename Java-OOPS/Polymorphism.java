public class Polymorphism {
    public static void main(String[] args) {

        Animal a1 = new Dog();//shows polymorphism
        Animal a2 = new Cat();//shows polymorphism

        a1.sound();
        a2.sound();
    }
public static class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

public static class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public static class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
}
   

