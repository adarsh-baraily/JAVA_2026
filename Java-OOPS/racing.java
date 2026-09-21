public class racing {

    String colour;
    String name;
    int model = 0;

    racing(String colour, String name, int model) {
        this.colour = colour;
        this.name = name;
        this.model = model;
    }

    void display() {
        System.out.println("You are playing car race with "  + this.colour + " coloured " + this.name + " of " + this.model);
    }
public static void main(String[] args) {

    racing rc1 = new racing("Black","Lambo",2017);
    racing rc2 = new racing("Red", "Mustang", 2015);

    racing[] cars = {rc1,rc2};

    for(int i = 0; i < cars.length; i++) {
        cars[i].display();
    }

   }

}
