public class datarecord {
    public static void main(String[] args) {

        Student s1 = new Student("Adarsh", 17);

        s1.setName("Krishna");
        s1.setAge(18);

        // Getting values using getters
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());
    }
    public static class Student {
    // Private variables
    private String name;
    private int age;

    Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    //Setter method for name 
    public void setName(String name) {
        this.name = name;
    }

    //Setter method for age 
    public void setAge(int age) {
        this.age = age;
    }
}
}

