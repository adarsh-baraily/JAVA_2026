import java.util.HashMap;
public class first {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Adarsh", 85);
        students.put("Rahul", 78);
        students.put("Ankit", 92);
        students.put("Riya", 88);

        System.out.println(students);
        System.out.println("Adarsh's marks: " + students.get("Adarsh"));
        System.out.println("Does Rahul exist? " + students.containsKey("Rahul"));
        students.put("Rahul", 82);
        students.remove("Ankit");
        System.out.println("Final student list: " + students);
    }
}