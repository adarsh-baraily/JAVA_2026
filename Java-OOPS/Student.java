public class Student {
    public static void main(String[] args) {

        College college1 = new College("Rahul", 1, 7.2);
        College college2 = new College("Kush", 2, 8.9);

        System.out.println(college1.name);
        System.out.println(college1.isEnrolled);
        System.out.println(college1.rollno);
        System.out.println(college1.cgpa);

        System.out.println(college2.name);
        System.out.println(college2.isEnrolled);
        System.out.println(college2.rollno);
        System.out.println(college2.cgpa);

        college1.study();
        college2.study();



    }
    
}
