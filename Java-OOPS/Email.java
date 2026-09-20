public class Email {

    String username;
    String email;
    int age;

    Email(String username) {
        this.username = username;
        this.email = "Null";
        this.age = 0;
    }

    Email(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    Email(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age =  age;
    } 

}