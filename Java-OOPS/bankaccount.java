class bankaccount {

    String name;
    int accountNumber;
    double balance;

    // Constructor
    bankaccount(String n, int acc, double bal) {
        name = n;
        accountNumber = acc;
        balance = bal;
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {

        bankaccount account1 = new bankaccount("Adarsh", 101, 5000);

        account1.display();
    }
}
```