package FinalProyect;

import java.util.Scanner;

public class BankApp {
    private BankAccount bankAccount;
    private Scanner scanner;

    public BankApp(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;
        do {
            displayMenu();
            option = scanner.nextInt();
            processOption(option);
        }while(option !=4);
    }

    public void displayMenu(){
        System.out.println("\nSeleccionar opciones");
        System.out.println("1 - Depositar");
        System.out.println("2 - Retirar");
        System.out.println("3 - Mostrar Saldo");
        System.out.println("4 - Salir");
    }

    private int getUserOption(Scanner scanner){
        return scanner.nextInt();
    }

    private void handleDeposit(){
        System.out.print("Ingrese el monto a depositar: ");
        double depositAmount = scanner.nextDouble();
        bankAccount.deposit(depositAmount);
    }

    private void handleWithdrawal(){
        System.out.print("Ingrese el monto a retirar: ");
        double withdrawAmmount = scanner.nextDouble();
        bankAccount.withdrew(withdrawAmmount);
    }

    private void processOption(int option){
        switch (option){
            case 1: {
                handleDeposit();
                break;
            }
            case 2: {
                handleWithdrawal();
                break;
            }
            case 3: {
               bankAccount.displayBalance();
               break;
            }
            case 4: {
                System.out.println("Hasta pronto...");
                break;
            }
            default: {
                System.out.println("Opción incorrecta");
            }
        }
    }
}
