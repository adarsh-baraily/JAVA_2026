public class Friends {

    String name;
    static int numoffriends;

    Friends(String name) {
        this.name = name;
        numoffriends++;
    }
  
    static void shownooffriends() {
        System.out.println("You have " + numoffriends + " total no. of Friends");
    }

    public static void main(String[] args) {

        Friends fr1 = new Friends("Ankul");
        Friends fr2 = new Friends("Kush");
        Friends fr3 = new Friends("Rukhmani");
        Friends fr4 = new Friends("Lalita");

        Friends.shownooffriends();

    }
    
}
