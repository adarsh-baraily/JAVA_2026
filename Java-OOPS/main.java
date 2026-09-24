public class main {
    public static void main(String[] args) {

        Person person = new Person("Anup", "Kumar");
        Learner stu = new Learner("Adarsh", "Baraily", 8.0);

        person.showName();
        stu.showCGPA();
        stu.showName();
    }
}