public class Work {
    public static void main(String[] args) {

        Email email1 = new Email("Vrishbhanu");
        Email email2 = new Email("Vrishbhanu", "Vrishbhanu04@gmail.com");
        Email email3 = new Email("Vrishbhanu", "Vrishbhanu04@gmail.com", 30);

        System.out.println(email1.username);
        System.out.println(email1.email);
        System.out.println(email1.age);

        System.out.println(email2.username);
        System.out.println(email2.email);
        System.out.println(email2.age);

        System.out.println(email3.username);
        System.out.println(email3.email);
        System.out.println(email3.age);


    }
}