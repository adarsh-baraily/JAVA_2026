public class anonymous {
    public static void main(String[] args) {

        Dog dg1 = new Dog();
        Dog dg2 = new Dog() {

            @Override
            void speak() {

                System.out.println("But this dog says #Ruh Roh#");

            }
        };

        dg1.speak();
        dg2.speak();

        
    }
    public static class Dog {
        void speak() {
            System.out.println("Dogs always bark");
        }
    }
        
    
    
}
