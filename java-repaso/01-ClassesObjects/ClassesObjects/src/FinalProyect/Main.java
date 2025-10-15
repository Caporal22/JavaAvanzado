package FinalProyect;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Daniel Sánchez", 1000.0);
        BankApp bankApp = new BankApp(bankAccount);
        bankApp.start();

    }
}
