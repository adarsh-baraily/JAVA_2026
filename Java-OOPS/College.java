public class College {

    String name;
    int rollno = 0;
    double cgpa = 0;
    boolean isEnrolled;

    College(String name, int rollno, double cgpa) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
        this.isEnrolled = true;
    }

    void study() {

        System.out.println(this.name + "is allowed to give his next exam");
    }    

}
