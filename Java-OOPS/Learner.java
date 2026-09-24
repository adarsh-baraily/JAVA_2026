public class Learner extends Person {

    double cgpa;

    Learner(String firstname, String lastname, double cgpa) {
        super(firstname, lastname);
        this.cgpa = cgpa;
    }

    void showCGPA() {
        System.out.println("The student's cgpa is : " + this.cgpa);
    }
    
}
