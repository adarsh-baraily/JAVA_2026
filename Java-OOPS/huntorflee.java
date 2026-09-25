public class huntorflee {
    public static void main(String[] args) {

        Hawk hk = new Hawk();
        Snake sn = new Snake();
        Rabbit rb = new Rabbit();

        hk.hunt();
        rb.flee();
        sn.flee();
        sn.hunt();



    }
    public interface Prey {

        void flee() ;
    
    }
    public interface Predator {

        void hunt();
        
    }
    public static class Rabbit implements Prey {
        @Override 
        public void flee() {
            System.out.println("The rabbit is running away !");
        }
    }
    public static class Snake implements Prey, Predator {
        @Override 
        public void flee() {
            System.out.println("The snake is moving away !");
        }
        public void hunt() {

            System.out.println("The snake is on a hunt !");

        }
    }
    public static class Hawk implements Predator {
        @Override 
        public void hunt() {
            System.out.println("The hawk is on its hunt !");
        }
    }
}
    
    

