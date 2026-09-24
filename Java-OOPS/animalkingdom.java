public class animalkingdom {
    public static void main(String[] args) {

        lion ln = new lion();
        tiger tg = new tiger();
        fish fh = new fish();

        ln.action();
        tg.action();
        fh.swim();





    }
    public static class animals {

    void action() {
        System.out.println("The animal is running");
    }

    void swim() {
    }

}
public static class lion extends animals {
}
public static class tiger extends animals {
}
public static class fish extends animals {

    @Override 
    void swim() {
        System.out.println("The fishes are swimming");
    }
}
}



